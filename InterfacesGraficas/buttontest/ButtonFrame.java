
package buttontest;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
{
    private JButton simplesJButton;
    private JButton elaboradoJButton;
    
    public ButtonFrame()
    {
        super( "Testando botões" );
        setLayout( new FlowLayout() );
        simplesJButton = new JButton( "Botão simples" );
        add( simplesJButton );
        
        Icon bug1 = new ImageIcon( getClass().getResource( "bug1.gif") );
        Icon bug2 = new ImageIcon( getClass().getResource( "bug2.gif") );
        elaboradoJButton = new JButton( "Botão elaborado", bug1 );
        elaboradoJButton.setRolloverIcon( bug2 );
        add( elaboradoJButton );
        
        ButtonHandler handler = new ButtonHandler();
        elaboradoJButton.addActionListener( handler );
        simplesJButton.addActionListener( handler );
    }
    public class ButtonHandler implements ActionListener
{
    public void actionPerformed( ActionEvent event )
    {
        JOptionPane.showMessageDialog( ButtonFrame.this, String.format( "Você precionou: %s", event.getActionCommand() ) );
    }
}

}
