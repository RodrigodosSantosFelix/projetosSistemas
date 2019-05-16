package com.service.analisador;

import java.util.*;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author SI
 */
@WebService(
        name = "AnalisadorMultas",
        serviceName = "AnalisadorMultasService")

public class AnalisadorMultas {

    private static final String banco = "jdbc:derby://localhost:1527/Multas";
    private static final String user = "root";
    private static final String passw = "root";
    private Connection connect = null;
    private PreparedStatement stmt = null;
    private ResultSet retorno = null;
    private String[] envio;

private String getDateTime() { 
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); 
	Date dataA = new Date(); 
	return dateFormat.format(dataA); 
}
private String StringToDate(String data) { 
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); 
	return dateFormat.format(data); 
}

    @WebMethod(operationName = "consultaPontos")
    public String pontos(@WebParam(name = "carta") String carta) {
      String dataA = getDateTime();
        try {
            connect = DriverManager.getConnection(banco, user, passw);
            String query = "SELECT * FROM carteira WHERE n_carteira = ?";
            stmt = connect.prepareStatement(query);
            stmt.setString(1, carta);
            retorno = stmt.executeQuery();
            if (retorno.next()) {
                String pontos = retorno.getString("pontos");
                String multas = retorno.getString("multas_a_pagar");
                String vencimento = retorno.getString("vencimento");
                //envio[2] = retorno.getString("vencimento");
             if (dataA.before(vencimento)){
	
                    return "carta vencida";
                }

                   return "Vencimento"+vencimento+" data de hoje";
            }
            return retorno.toString();
        } catch (SQLException e) {
            return "erro ao conectar";
        }
    }
}
