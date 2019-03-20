package com.service.verificarmatricula;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(name = "VerificarMatricula",
        serviceName = "VerificarMatriculaService")
public class VerificarMatricula {

    private static final String banco = "jdbc:derby://localhost:1527/escola";
    private static final String usuario = "root";
    private static final String senha = "root";
    private Connection conexao = null;
    private PreparedStatement localizar = null;

    @WebMethod(operationName = "checarmatricula")
    public boolean checarmatricula(@WebParam(name = "nome") String nome, @WebParam(name = "email") String email){
        try
        {
            conexao = DriverManager.getConnection(banco,usuario,senha);
            String vSQL = "SELECT codigo from aluno WHERE matricula = 1 AND nome = ? AND email = ?";
            localizar = conexao.prepareStatement(vSQL);
           
            localizar.setString(1, nome);
            localizar.setString(2, email);
            ResultSet resultado = localizar.executeQuery();
            
            if (resultado.next())
            {
                return true;
            }
           
                return false;
            }
        catch(SQLException e)
        {
            System.out.println("Erro: " + e.getErrorCode() + "Descrição: " + e.getCause());
            return false;
        }
    }
}
