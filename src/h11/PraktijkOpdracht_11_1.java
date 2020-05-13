package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PraktijkOpdracht_11_1 extends Applet {

    Label label;
    TextField tekstvak;
    Button knop;

    int cijfer1 = 0, cijfer2 = 1, resultaat;
    int posY = 80;
    String input;
    boolean schakelaar = false;


    public void init () {
        setSize(400, 300);
        label = new Label("Type een tafel in");
        tekstvak = new TextField("", 10);
        knop = new Button("Ok");
        knop.addActionListener(new KnopLis());

        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint (Graphics g) {

        if (schakelaar == true) {
            for (int i = 0; i < 10; i++) {
                resultaat = cijfer1 * cijfer2;
                g.drawString("" + cijfer1 + " x " + cijfer2 + " = " + resultaat, 40, posY);
                posY += 20;
                cijfer2 += 1;
            }
        }
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input = tekstvak.getText();
            cijfer1 = Integer.parseInt(input);

            posY = 80;
            cijfer2 = 1;
            schakelaar = true;
            repaint();
        }
    }
}
