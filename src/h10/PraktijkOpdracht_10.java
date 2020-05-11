package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PraktijkOpdracht_10 extends Applet {

    Label label;
    TextField tekstvak;
    Button knop;

    int cijfer;
    String input, tekst = "";


    public void init () {
        setSize(400, 300);
        label = new Label("Type een cijfer in van 1 t/m 10");
        tekstvak = new TextField("", 10);
        knop = new Button("Ok");
        knop.addActionListener(new KnopLis());

        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint (Graphics g) {

        g.drawString("Dit cijfer is: " + tekst, 15, 100);
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input = tekstvak.getText();
            cijfer = Integer.parseInt(input);

            switch (cijfer) {
                case 1:
                    tekst = "slecht";
                    break;
                case 2:
                    tekst = "slecht";
                    break;
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                    tekst = "voldoende";
                    break;
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "goed";
                    break;
                case 9:
                    tekst = "goed";
                    break;
                case 10:
                    tekst = "goed";
                    break;
                default:
                    tekst = "Dit cijfer is fout, type een cijfer in van 1 t/m 10";
                    break;
            }
            repaint();
        }
    }
}
