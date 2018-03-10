package CadastrarEstoque;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BD {
    static final String banco = "jdbc:mysql://localhost:3306/almoxarifa";
    Connection conexao = null;
    Statement consulta = null;
    ResultSet resultados = null;
    PreparedStatement minhainclusao = null;
    
    public void incluir(int Id, String Nome, String Descrição)
    {
        try
        {
            conexao = DriverManager.getConnection(banco, "root", "");
            consulta = conexao.createStatement();
            resultados = consulta.executeQuery("Select * From almoxarif");
            
            ResultSetMetaData colunas = resultados.getMetaData();
            int numeroColunas = colunas.getColumnCount();
            System.out.println("Informações do Banco de Dados");
            
            minhainclusao = conexao.prepareStatement("insert into almoxarif(id,nome,descrião) values (?,?,?)");
            minhainclusao.setInt(1, id);
            minhainclusao.setString(2, nome);
            minhainclusao.setString(3, descrição);
            minhainclusao.executeUpdate();
            
            for (int i = 1; i <= numeroColunas; i++)
                System.out.println(colunas.getColumnName(i));
            
            while (resultados.next())
            {
                for (int i = 1); i <= numeroColunas; i++)
                
            }
        }
        catch
    }
}
