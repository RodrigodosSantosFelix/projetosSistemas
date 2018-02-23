
package excluirdados;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirDados {

    static final String banco = "jdbc:mysql://localhost:3306/agenciaviagens";
    
    public static void main(String[] args) {
    Connection conexao = null;
    Statement consulta = null;
    ResultSet resultados = null;
    PreparedStatement minhaexclusao = null;
    
    try
    {
        conexao = DriverManager.getConnection(banco,"root","");
        consulta = conexao.createStatement();
        
        resultados = consulta.executeQuery("Select * from turista");
        
        ResultSetMetaData colunas = resultados.getMetaData();
        int numeroColunas = colunas.getColumnCount();
        System.out.println("Informação do banco de dados");
        
        minhaexclusao = conexao.prepareStatement("delete from turista where codigo = ?");
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o codigo do turista a ser excluido"));
        
        minhaexclusao.setInt(1, codigo);
        minhaexclusao.executeUpdate();
        
        while (resultados.next())
        {
            for (int i=1; i <= numeroColunas; i++)
                System.out.println("dados " + resultados.getObject(i));
            System.out.println("Dados Excluidos com sucesso");
            
        }
                }
    catch (SQLException erro) {
    erro.printStackTrace();
                }
    finally
    {
        try
        {
            resultados.close();
            consulta.close();
            conexao.close();
        }
        catch (Exception erronovo)
        {
            erronovo.printStackTrace();
        }
    }
    }   
}