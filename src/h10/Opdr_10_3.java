package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_10_3 extends Applet {

    Label label;
    TextField tekstvak;

    int maandNummer;
    String input, tekst = "";


    public void init () {
        setSize(400, 300);
        label = new Label("Type een nummer van een maand in en druk op enter");
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new TekstvakLis());

        add(label);
        add(tekstvak);
    }

    public void paint (Graphics g) {
        g.drawString(tekst, 15, 100);
    }

    class TekstvakLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input = tekstvak.getText();
            maandNummer = Integer.parseInt(input);

            switch (maandNummer) {
                case 1:
                    tekst = "Januari heeft 31 dagen.";
                    break;
                case 2:
                    tekst = "Februari heeft 28 dagen en 29 bij een schrikkeljaar.";
                    break;
                case 3:
                    tekst = "Maart heeft 31 dagen.";
                    break;
                case 4:
                    tekst = "April heeft 30 dagen.";
                    break;
                case 5:
                    tekst = "Mei heeft 31 dagen.";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen.";
                    break;
                case 7:
                    tekst = "Juli heeft 31 dagen.";
                    break;
                case 8:
                    tekst = "Augustus heeft 31 dagen.";
                    break;
                case 9:
                    tekst = "September heeft 30 dagen.";
                    break;
                case 10:
                    tekst = "Oktober heeft 31 dagen.";
                    break;
                case 11:
                    tekst = "November heeft 30 dagen.";
                    break;
                case 12:
                    tekst = "December heeft 31 dagen.";
                    break;
                default:
                    tekst = "Deze maand bestaat niet.";
                    break;
            }
            repaint();
        }
    }
}
