package h12;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_12_6 extends Applet {

    Label label;
    TextField tekstvak;
    Button knop;

    int[] getallen = {1, 3, 4, 5, 7, 7, 4, 7, 1, 9, 5, 9, 9, 4, 2, 1, 9, 4, 1, 8, 8, 6, 9};
    int inputGetal, aantalKeer, teller;
    String input;
    boolean schakelaar = false;


    public void init () {
        setSize(400, 300);
        label = new Label("Type een cijfer in van 1 t/m 9");
        tekstvak = new TextField("", 10);

        knop = new Button("Ok");
        knop.addActionListener(new KnopLis());

        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint (Graphics g) {

        if (schakelaar == true) {
            g.drawString("De waarde " + inputGetal + ", komt " + aantalKeer + " keer voor.", 40, 100);
        }
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            input = tekstvak.getText();
            inputGetal = Integer.parseInt(input);

            teller = 0;
            aantalKeer = 0;
            schakelaar = true;

            while (teller < getallen.length) {
                if (getallen[teller] == inputGetal) {
                    aantalKeer++;
                }
                teller++;
            }

            repaint();
        }
    }
}
