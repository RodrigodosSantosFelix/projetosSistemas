
package rotulos;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    


    public LabelFrame()
    {
        super( "Testando JLabel" );
        setLayout( new FlowLayout() );
        setLocation( 200, 400 );

        label1 = new JLabel( "Label com Texto" );
        label1.setToolTipText( "Este é o label1");
        add( label1 );

        Icon bug = new ImageIcon( getClass().getResource( "bug1.gif" ) );

        label2 = new JLabel( "Label com Texto e Icone", bug, SwingConstants.LEFT );
        label2.setToolTipText( "Este é o label2" );
        add( label2 );

        label3 = new JLabel();
        label3.setText( "Label com icone e texto na parte inferior" );
        label3.setIcon( bug );
        label3.setHorizontalTextPosition( SwingConstants.CENTER );
        label3.setVerticalTextPosition( SwingConstants.BOTTOM );
        label3.setToolTipText( "Este é o label3" );
        add( label3 );
    }
}