package Desafio;
import java.sql.*;
import javax.swing.JOptionPane;

public class BD {
    public static Connection getConnection() throws SQLException{
        try {
            //sql2005 e 2008 driver JTDS           
            Class.forName("net.sourceforge.jtds.jdbc.Driver");             
            //return DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433/db;user=sa;password=2012;instance=SQLINSTANCE"); //com instancia
            return DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433;databaseName=Medicos","","");
            //sql2000 com driver JTDS
            //Class.forName("net.sourceforge.jtds.jdbc.Driver");                           
            //return DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433;databaseName=db","sa","senha");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());            
            throw new SQLException();            
        }
    }

    void consultar(int crm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
