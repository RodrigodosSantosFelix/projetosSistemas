/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fornecedor;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author si
 */
public class BD {
    static final String banco = "jdbc:mysql://localhost:3306/fornecedor";
    Connection conexao = null;
    ResultSet resultados = null;
    PreparedStatement minhaconsulta = null;
    
    public void consultar(int codigo)
    {
        try
        {
            conexao = DriverManager.getConnection(banco,"root","");
            minhaconsulta = conexao.prepareStatement("SELECT nome from produtos where codigo = ? ");
            minhaconsulta.setInt(1, codigo);
            resultados = minhaconsulta.executeQuery();
            
            ResultSetMetaData colunas = resultados.getMetaData();
            int numeroColunas = colunas.getColumnCount();
            
            while (resultados.next())
            {
                for (int i = 1; i <= numeroColunas; i++)
                    JOptionPane.showMessageDialog(null, "dados do produto " + resultados.getObject(i));
                
            }
        }
        catch (SQLException erro)
        {
            erro.printStackTrace();
        }
        finally
        {
            try
            {
                resultados.close();
                minhaconsulta.close();
                conexao.close();
                
            }catch (Exception erronovo)
            {
                erronovo.printStackTrace();
            }
        }
    }
}
