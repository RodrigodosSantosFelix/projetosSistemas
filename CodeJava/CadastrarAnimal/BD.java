/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastrarAnimal;

/**
 *
 * @author 010617040
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
    static final String banco = "jdbc:mysql://localhost:3306/zoo";
        Connection conexao = null;
        Statement consulta = null;
    ResultSet resultados = null;
    PreparedStatement minhainclusao = null;
    
    public void incluir(String especie, String nome)
    {
        try
        {
            conexao = DriverManager.getConnection(banco,"root","");
            consulta = conexao.createStatement();
            resultados = consulta.executeQuery("Select * From animal");
            
            ResultSetMetaData colunas = resultados.getMetaData();
            int numeroColunas = colunas.getColumnCount();
            System.out.println("Informações do Banco de Dados");
            
            minhainclusao = conexao.prepareStatement("insert into animal (especie,nome) values (?,?)");
            minhainclusao.setString(1,especie);
            minhainclusao.setString(2,nome);
            minhainclusao.executeUpdate();
            
            for (int i = 1; i <= numeroColunas; i++)
                System.out.println(colunas.getColumnName(i));
            while (resultados.next())
                    {
                        for (int i = 1; i <= numeroColunas; i++)
                            System.out.println("dados " + resultados.getObject(i));
                        System.out.println();
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