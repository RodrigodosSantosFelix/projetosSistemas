package desafio_de_programacao;
/*  ITE
    Rodrigo dos Santos Felix 010617040*/

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Desafio_de_Programacao
{
    static final String banco = "jdbc:mysql://localhost:3306/eletronicos";
    
    public static void main(String[] args)
    {
        Connection connection = null;
        Statement consult = null;
        ResultSet result = null;
        PreparedStatement myupdate = null;
        
        try
        {
            connection = DriverManager.getConnection(banco,"root","");
            consult = connection.createStatement();
            
            result = consult.executeQuery("Select * from monitores");
            
            ResultSetMetaData column = result.getMetaData();
            int numberColumn = column.getColumnCount();
            System.out.println("Informações do Banco de Dados");
            
            myupdate = connection.prepareStatement("Update monitores Set valor = ? where codigo = ?");
            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o código da informação que deseja alterar"));
            
            myupdate.setInt(1,codigo);
            myupdate.executeUpdate();
            
            while (result.next())
            {
                for (int i = 1; i <= numberColumn; i++ )
                    System.out.println("dados " + result.getObject(i));
                    System.out.println();
                    System.out.println("Alteração realizada com sucesso");
            }
        }
        catch (SQLException error)
        {
            error.printStackTrace();
        }
        finally
        {
        try
        {
            result.close();
            consult.close();
            connection.close();
        }
        catch (Exception newerror)
        {
            newerror.printStackTrace();
        }
        }        
    }
}
