package cadastro;
import java.awt.*;
public class CadastroLivro extends Frame
{
    
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bCadastrar, bSair;
    protected TextField tfLivro;
    protected Label lLivro;
    
    public CadastroLivro()
    {
        Dimension dQuadro = new Dimension(350,200);
        Dimension dRotulo = new Dimension(90,25);
        Dimension dCaixaTexto = new Dimension(200,25);
        Dimension dBotao = new Dimension(180,25);
        
        setTitle("Cadastrar Livro");
        setResizable(false);
        setSize(dQuadro);
        setLocation(400,200);
        setLayout(null);
        
        lLivro = new Label("Título do Livro");
        lLivro.setSize(dRotulo);
        lLivro.setLocation(25,50);
        
        tfLivro = new TextField();
        tfLivro.setSize(dCaixaTexto);
        tfLivro.setLocation(80,50);
        
        bCadastrar = new Button("Cadastrar Livro");
        bCadastrar.setSize(dBotao);
        bCadastrar.setLocation(25,150);
        
        bSair = new Button("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(130,150);
        
        add(lLivro);
        add(tfLivro);
        add(bCadastrar);
        add(bSair);
    }
}
