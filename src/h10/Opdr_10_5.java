package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_10_5 extends Applet {

    Label label1, label2, label3, label4, resultaatLabel;
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4;
    Button knop;

    double gemiddelde, c1, c2, c3, c4;
    int doubleToInt;
    String input1, input2, input3, input4, beoordeling = "";


    public void init () {
        setSize(350, 300);
        label1 = new Label("Type je cijfer in van periode 1");
        tekstvak1 = new TextField("", 10);

        label2 = new Label("Type je cijfer in van periode 2");
        tekstvak2 = new TextField("", 10);

        label3 = new Label("Type je cijfer in van periode 3");
        tekstvak3 = new TextField("", 10);

        label4 = new Label("Type je cijfer in van periode 4");
        tekstvak4 = new TextField("", 10);

        resultaatLabel = new Label("Druk op Ok om je resultaat te zien");
        knop = new Button("Ok");
        knop.addActionListener(new KnopOkLis());

        add(label1);
        add(tekstvak1);
        add(label2);
        add(tekstvak2);
        add(label3);
        add(tekstvak3);
        add(label4);
        add(tekstvak4);
        add(resultaatLabel);
        add(knop);
    }

    public void paint (Graphics g) {

        g.drawString("Je gemiddelde is: " + gemiddelde, 35, 180);
        g.drawString(beoordeling, 35, 200);
    }

    class KnopOkLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            input3 = tekstvak3.getText();
            input4 = tekstvak4.getText();
            c1 = Double.parseDouble(input1);
            c2 = Double.parseDouble(input2);
            c3 = Double.parseDouble(input3);
            c4 = Double.parseDouble(input4);

            gemiddelde = (c1 + c2 + c3 + c4) / 4;

            gemiddelde = gemiddelde * 10;
            doubleToInt = (int) gemiddelde;
            gemiddelde = doubleToInt;
            gemiddelde = gemiddelde / 10;

            if (gemiddelde > 5.5) {
                beoordeling = "Je hebt een voldoende, gefeliciteerd je bent geslaagd.";
            }
            else if (gemiddelde < 5.5) {
                beoordeling = "Je hebt een onvoldoende, je bent gezakt.";
            }
            repaint();
        }
    }
}
