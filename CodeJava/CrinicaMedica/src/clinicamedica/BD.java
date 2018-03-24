package clinicamedica;

import javax.swing.JOptionPane;
import java.sql.*;

public class BD
{
    static final String banco = "jdbc:mysql://localhost:3306/crinicamedica";
    Connection connection = null;
    Statement query = null;
    ResultSet results = null;
    PreparedStatement myinclude = null;
    
    public void include (int crm, String nomemed, String especialidademed)
    {
        try
        {
            connection = DriverManager.getConnection(banco,"root","");
            query = connection.createStatement();
            results = query.executeQuery("SELECT * FROM medicos");
            
            ResultSetMetaData column = results.getMetaData();
            int numberColumn = column.getColumnCount();
            System.out.println ("Informações do Banco de Dados CrinicaMedica");
            
            myinclude = connection.prepareStatement("INSERT INTO medicos(crm,nomemed,especialidadeMed) VALUES (?,?,?)");
            myinclude.setInt(1, crm);
            myinclude.setString(2, nomemed);
            myinclude.setString(3, especialidademed);
            myinclude.executeUpdate();
            
            for (int i = 1; i <= numberColumn; i++)
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
            catch (Exception newerror)
            {
                newerror.printStackTrace();
            }
        }
    }
}
