
package cadastrocliente;
import java.awt.*;

public class FormularioCliente extends Frame
{
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected TextField tfNome, tfSenha, tfEMail, tfTelefone, tfCPF, tfCEP, tfNumero;
    protected Button bConcluir, bCancelar;
    protected Label lNome, lSenha, lEMail, lTelefone, lCPF, lCEP, lNumero;
    
    public FormularioCliente()
    {
        Dimension dQuadro = new Dimension(550,600);
        Dimension dRotulo = new Dimension(45,25);
        Dimension dCaixaTexto = new Dimension(400,25);
        
        setTitle("CADASTRO DE CLIENTE");
        setResizable(false);
        setSize(dQuadro);
        setLocation(400,200);
        setLayout(null);
    
        lNome = new Label("NOME");
        lNome.setSize(dRotulo);
        lNome.setLocation(25,50);
    
        tfNome = new TextField();
        tfNome.setSize(dCaixaTexto);
        tfNome.setLocation(80,50);
     
        add(lNome);
        add(tfNome);
    }
}
package cadastrocliente;

public class CadastroCliente {

    public static void main(String[] args) {
        FormularioCliente formUm = new FormularioCliente();
        formUm.setVisible(true);
    }
}
