package SistemadeApoioDecisao;

import java.sql.*;

public class BD {

    final String ConnectionURL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=MineralRequirements;integratedSecurity=true;";
    String User = "";
    String Password = "";
    final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    Statement stmt = null;
    ResultSet rs = null;
    Connection con = null;

    public void connect() throws Exception, SQLException {
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(ConnectionURL, User, Password);
        stmt = con.createStatement();
    }

    public void closeconnect() throws Exception, SQLException {
        stmt.close();
        con.close();
    }

    public Statement getStatement() {
        return stmt;
    }

    public Connection getConnection() {
        return con;
    }
}
