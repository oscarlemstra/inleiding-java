package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PraktijkOpdracht_11_2 extends Applet {

    Button knopVorige, knopVolgende;

    int cijfer1 = 1, cijfer2 = 1, resultaat;
    int posY = 80;


    public void init () {
        setSize(400, 300);
        knopVorige = new Button("Vorige tafel");
        knopVorige.addActionListener(new KnopLisVor());

        knopVolgende = new Button("Volgende tafel");
        knopVolgende.addActionListener(new KnopLisVol());

        add(knopVorige);
        add(knopVolgende);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < 10; i++) {
            resultaat = cijfer1 * cijfer2;
            g.drawString("" + cijfer1 + " x " + cijfer2 + " = " + resultaat, 20, posY);
            posY += 20;
            cijfer2 += 1;
        }
    }


    class KnopLisVor implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            if (cijfer1 > 1) {
                posY = 80;
                cijfer1 -= 1;
                cijfer2 = 1;
                repaint();
            }
        }
    }

    class KnopLisVol implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            if (cijfer1 < 10) {
                posY = 80;
                cijfer1 += 1;
                cijfer2 = 1;
                repaint();
            }
        }
    }
}
