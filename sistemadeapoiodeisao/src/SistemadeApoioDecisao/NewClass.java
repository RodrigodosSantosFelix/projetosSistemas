package SistemadeApoioDecisao;

import java.awt.*;
import javax.swing.*;

public class NewClass {

    void TextoPotassio() {

        JFrame frame = new JFrame("JTextArea Test");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String infopotassio = "Para atingir a quantidade suficiente de potássio no solo"
                + ", podece utilizar a vinhaça de cana que é rica em potássio";
                
        
//                 "A vinhaça de cana é rica em potássio e possui "
//                + "teores relativamente elevados de outros elementos. "
//                + "A composição desse resíduo é muito variável, dependendo das "
//                + "condições em que a usina vem operando. Se for considerado "
//                + "apenas o efeito do potássio, pode-se dizer que praticamente"
//                + " 100% deste elemento está disponível para as plantas. "
//                + "A vinhaça contém ainda nitrogênio, enxofre, matéria orgânica"
//                + " e alguns microelementos. Sua aplicação mais racional deve "
//                + "ser feita com base no teor de potássio. A maioria das aplicações"
//                + " vem sendo feita in natura, em quantidades que variam de 50 a 200 m³ ha-¹ ";


        JTextArea textAreal = new JTextArea(infopotassio);
        textAreal.setPreferredSize(new Dimension(300, 150));
        textAreal.setLineWrap(true);
        textAreal.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textAreal, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);

    }
}
