
package usarformularioeventos;

import javax.swing.JOptionPane;

public class Aluno {
    private String nome;
    
    public Aluno(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void validarAluno(String variavelnome)
    {
        if (this.getNome().equals(variavelnome))
        {
            JOptionPane.showMessageDialog(null, "   Aluno(a) " + this.nome + " autorizado! ");
        } else
        {
            JOptionPane.showMessageDialog(null, "Aluno(a) " + variavelnome + " desconhecido! ");
        }
    }
}
