package usarformularioeventos;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioAlunoNovo extends Frame implements ActionListener 
{
    protected Dimension dQuadro, dRotulo, dCaixaTexto, dBotao;
    protected Button bValidar, bSair;
    protected TextField tfAluno;
    protected Label lAluno;
    
    Aluno alunoUm = new Aluno("Eliane");
    
    public FormularioAlunoNovo()
    {
        Dimension dQuadro = new Dimension(290,200);
        Dimension dRotulo = new Dimension(45,25);
        Dimension dCaixaTexto = new Dimension(180,25);
        Dimension dBotao = new Dimension(100,25);
        
        setTitle("Novo Validar Aluno");
        setResizable(false);
        setSize(dQuadro);
        setLocation(650,350);
        setLayout(null);
        
        lAluno = new Label("Aluno");
        lAluno.setSize(dRotulo);
        lAluno.setLocation(25,50);
        
        tfAluno = new TextField();
        tfAluno.setSize(dCaixaTexto);
        tfAluno.setLocation(80,50);
        
        bValidar = new Button("Validar Aluno");
        bValidar.setSize(dBotao);
        bValidar.setLocation(25,150);
        bValidar.addActionListener(this);
        
        bSair = new Button("Sair");
        bSair.setSize(dBotao);
        bSair.setLocation(130,150);
        bSair.addActionListener(this);
        
        add(lAluno);
        add(tfAluno);
        add(bValidar);
        add(bSair);
    }
    
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getSource() == bValidar)
        {
            alunoUm.validarAluno(tfAluno.getText());
        }
        if (evento.getSource() == bSair)
        {
            System.out.println("Fim do Aplicativo. Obrigado!");
                   
        }
    }
}
