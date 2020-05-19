package h12;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_12_4en5 extends Applet {

    int gezocht, teller, posY = 100;
    int[] getallen;
    String input, tekst = "";
    boolean gevonden = false;

    Label label;
    TextField tekstvak;
    Button knop;


    public void init () {
        setSize(400, 300);

        getallen = new int[50];

        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = i * 3 + 2;
        }


        label = new Label("Type een cijfer");
        tekstvak = new TextField("", 10);

        knop = new Button("Ok");
        knop.addActionListener(new KnopLis());


        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint (Graphics g) {

        g.drawString(tekst, 40, 50);

        int posX = 20;

        for (int i = 0; i < getallen.length; i++) {
            g.drawString("" + getallen[i], posX, posY);
            posY += 20;

            if (posY == 200) {
                posX += 30;
                posY = 100;
            }
        }
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            input = tekstvak.getText();
            gezocht = Integer.parseInt(input);

            teller = 0;
            gevonden = false;

            while (teller < getallen.length) {
                if (getallen[teller] == gezocht) {
                    gevonden = true;
                    break;
                }
                teller++;
            }


            if (gevonden == true) {
                tekst = "Het getal is gevonden: index = " + teller;
            }
            else {
                tekst = "Er is geen getal gevonden";
            }

            repaint();
        }
    }
}
