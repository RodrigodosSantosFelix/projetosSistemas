package projectittest;
import java.sql.*;

public class ProjectITtest {
     static final String ConnectionURL = "jdbc:sqlserver://localhost:1433;" + 
             "databaseName=ProjetosdeTi;integratedSecurity=true;";
     
    public static void main(String[] args)
    {
       
        String User = "";
        String Password = "";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(ConnectionURL, User, Password);
            System.out.println("Conexão Estabelecida/n");
            
            String SQL = "SELECT idProjeto, Projeto.Descricao, idEmpregado, Nome, Cargo.Descricao from projeto inner join Alocacao on Projeto.idProjeto = Alocacao.Projeto_idProjeto inner join Empregado on Empregado.idEmpregado = Alocacao.Empregado_idEmpregado inner join Cargo on Cargo.idCargo = Empregado.idCargo";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            
            ResultSetMetaData colunas = rs.getMetaData();
            int numeroColunas = colunas.getColumnCount();
            System.out.println("informações do Banco de Dados");
            
            for (int i=1; i<=numeroColunas; i++)
            System.out.println(colunas.getColumnName(i));
            
            while (rs.next())
            {
                for (int i=1; i<=numeroColunas; i++)
                    System.out.println(rs.getObject(i));
                    System.out.println("--------------------------------");
            }
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
      
        finally
        {
            try
            {
                rs.close();
                stmt.close();
                con.close();
            }
            catch (Exception erro)
            {
                erro.printStackTrace();
            }
        
    }
    
    }
}