/*
Rodrigo dos Santos Felix
010617040
27/10/2017
 */
package checkboxtest;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame 
{
    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italicJCheckBox;
    
    public CheckBoxFrame()
    {
        super( "JCheckBox Teste" );
        setLayout( new FlowLayout() );
        
        textField = new JTextField( "Ver a alteração do estilo da fonte", 20);
        textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
        add( textField );
        
        boldJCheckBox = new JCheckBox( "Negrito" );
        italicJCheckBox = new JCheckBox( "Italico" );
        add( boldJCheckBox );
        add( italicJCheckBox );
        
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener( handler );
        italicJCheckBox.addItemListener( handler );
    }
    private class CheckBoxHandler implements ItemListener
    {
        public void itemStateChanged( ItemEvent event )
        {
            Font font = null;
            
            if ( boldJCheckBox.isSelected() && italicJCheckBox.isSelected() )
                font = new Font( "Serif", Font.BOLD + font.ITALIC, 14 );
            else if ( boldJCheckBox.isSelected() )
                font = new Font( "Serif", Font.BOLD, 14 );
            else if ( italicJCheckBox.isSelected() )
                font = new Font( "Serif", Font.ITALIC, 14 );
            else
                font = new Font( "Serif", Font.PLAIN, 14 );
            textField.setFont( font );
        }
    }
}
