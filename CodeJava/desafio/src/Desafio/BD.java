package Desafio;

/**
 *
 * @author rodri
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BD {
    static final String banco = "jdbc:mysql://localhost:3306/clinica";
    Connection conexao = null;
    
    ResultSet resultados = null;
    PreparedStatement minhaconsulta = null;
    
    public void consultar(int crm){
        try{
            conexao = DriverManager.getConnection(banco,"root","");
            minhaconsulta = conexao.prepareStatement("select nomemed from medicos where crm = ? ");
            minhaconsulta.setInt(1,crm);
            
            resultados = minhaconsulta.executeQuery();
            ResultSetMetaData colunas = resultados.getMetaData();
            int numeroColunas = colunas.getColumnCount();
            
            while (resultados.next()){
                for (int i = 1; i <= numeroColunas; i++)
                    JOptionPane.showMessageDialog(null, "dados do médico " + resultados.getObject(i));
            }
        }
        catch (SQLException erro){
            erro.printStackTrace();
        }
        finally{
            try{
                resultados.close();
                minhaconsulta.close();
                conexao.close();
            }
            catch (Exception erronovo){
                erronovo.printStackTrace();
            }
        }
    }   
}