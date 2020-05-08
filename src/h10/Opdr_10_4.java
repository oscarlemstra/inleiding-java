package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_10_4 extends Applet {

    Label labelMaand;
    TextField tekstvakMaand;

    Label labelJaar;
    TextField tekstvakJaar;

    int maandNummer, jaarNummer;
    String inputMaand, inputJaar, tekstMaand = "", tekstJaar = "";
    Boolean schrikkeljaar = false;


    public void init () {
        setSize(400, 300);
        labelMaand = new Label("Type een nummer van een maand in en druk op enter");
        tekstvakMaand = new TextField("", 5);
        tekstvakMaand.addActionListener(new TekstvakLisMaand());

        labelJaar = new Label("Type een jaartal in en druk op enter");
        tekstvakJaar = new TextField("", 15);
        tekstvakJaar.addActionListener(new TekstvakLisJaar());

        add(labelMaand);
        add(tekstvakMaand);

        add(labelJaar);
        add(tekstvakJaar);
    }

    public void paint (Graphics g) {
        g.drawString(tekstJaar, 15, 100);
        g.drawString(tekstMaand, 15, 120);
    }

    //voor de maanden
    class TekstvakLisMaand implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            inputMaand = tekstvakMaand.getText();
            maandNummer = Integer.parseInt(inputMaand);

            switch (maandNummer) {
                case 1:
                    tekstMaand = "Januari heeft 31 dagen.";
                    break;
                case 2:
                    if (schrikkeljaar == true) {
                        tekstMaand = "Februari heeft 29 dagen.";
                    }
                    else {
                        tekstMaand = "Februari heeft 28 dagen.";
                    }
                    break;
                case 3:
                    tekstMaand = "Maart heeft 31 dagen.";
                    break;
                case 4:
                    tekstMaand = "April heeft 30 dagen.";
                    break;
                case 5:
                    tekstMaand = "Mei heeft 31 dagen.";
                    break;
                case 6:
                    tekstMaand = "Juni heeft 30 dagen.";
                    break;
                case 7:
                    tekstMaand = "Juli heeft 31 dagen.";
                    break;
                case 8:
                    tekstMaand = "Augustus heeft 31 dagen.";
                    break;
                case 9:
                    tekstMaand = "September heeft 30 dagen.";
                    break;
                case 10:
                    tekstMaand = "Oktober heeft 31 dagen.";
                    break;
                case 11:
                    tekstMaand = "November heeft 30 dagen.";
                    break;
                case 12:
                    tekstMaand = "December heeft 31 dagen.";
                    break;
                default:
                    tekstMaand = "Deze maand bestaat niet.";
                    break;
            }
            repaint();
        }
    }

    //voor de jaren
    class TekstvakLisJaar implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            inputJaar = tekstvakJaar.getText();
            jaarNummer = Integer.parseInt(inputJaar);

            if ((jaarNummer % 4 == 0 && !(jaarNummer % 100 == 0)) || jaarNummer % 400 == 0) {
                tekstJaar = ""+ jaarNummer + " is een schrikkeljaar.";
                schrikkeljaar = true;
            }
            else {
                tekstJaar = ""+ jaarNummer + " is een gewoon jaar.";
                schrikkeljaar = false;
            }

            if (maandNummer == 2 && schrikkeljaar == true) {
                tekstMaand = "Februari heeft 29 dagen.";
            }
            else if (maandNummer == 2 && schrikkeljaar == false) {
                tekstMaand = "Februari heeft 28 dagen.";
            }
            repaint();
        }
    }
}
