package h12;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PraktijkOpdr_12 extends Applet {

    Label label1, label2;
    TextField tekstvak1, tekstvak2;
    Button knop;

    String[] namen, telefoonnummers;

    int posY = 120, i = 0;


    public void init () {
        setSize(400, 400);

        namen = new String[10];
        telefoonnummers = new String[10];

        label1 = new Label("Type een naam in");
        label2 = new Label("Type een telefoonnummer in");

        tekstvak1 = new TextField("", 20);
        tekstvak2 = new TextField("", 20);

        knop = new Button("Ok");
        knop.addActionListener(new KnopLis());


        add(label1);
        add(tekstvak1);
        add(label2);
        add(tekstvak2);
        add(knop);
    }

    public void paint (Graphics g) {

        if (i == 10) {
            g.drawString("Namen", 20, 100);
            g.drawString("Telefoonnummers", 180, 100);

            for (int i = 0; i < namen.length; i++) {
                g.drawString(namen[i], 20, posY);
                posY += 20;
            }

            posY = 120;

            for (int i = 0; i < telefoonnummers.length; i++) {
                g.drawString(telefoonnummers[i], 180, posY);
                posY += 20;
            }

            posY = 120;
        }
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            if (i < namen.length) {
                namen[i] = tekstvak1.getText();
                telefoonnummers[i] = tekstvak2.getText();
                i++;

                tekstvak1.setText("");
                tekstvak2.setText("");
            }

            repaint();
        }
    }
}
