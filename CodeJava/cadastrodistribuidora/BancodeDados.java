package cadastrodistribuidora;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Rodrigo dos Santos Felix 010617040
 */

public class BancodeDados
{
    static final String banco = "jdbc:mysql://localhost:3306/distribuidora";
    Connection connection = null;
    Statement query = null;
    ResultSet results = null;
    PreparedStatement myinclude = null;
    
    public void include(String Descrição, String Fabricante)
    {
        try
        {
            connection = DriverManager.getConnection(banco,"root","");
            query = connection.createStatement();
            results = query.executeQuery("Select * From Produtos");
            
            ResultSetMetaData column = results.getMetaData();
            int numberColumn = column.getColumnCount();
            System.out.println("Informações do Banco de Dados Distribuidora");
            
            myinclude = connection.prepareStatement("Insert into Produtos(Descrição,Fabricante) values (?,?)");
            myinclude.setString(1, Descrição);
            myinclude.setString(2, Fabricante);
            myinclude.executeUpdate();
            
            for (int i = 1; i<= numberColumn; i++)
                System.out.println(column.getColumnName(i));
            
            while (results.next())
            {
                for (int i = 1; i <= numberColumn; i++)
                    System.out.println("Dados " + results.getObject(i));
                System.out.println();
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
                results.close();
                query.close();
                connection.close();
            }
            catch(Exception newerror)
            {
                newerror.printStackTrace();
            }
        }
                
    }
}