package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_8_3 extends Applet {

    Label label;
    TextField tekstvak;
    Button knopOk;

    double btw = 21;
    String input;
    double bedrag, berekendBedrag;
    int doubleToInt;


    public void init () {
        setSize(400, 300);

        label = new Label("Type een bedrag");

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());

        knopOk = new Button("Ok");
        knopOk.addActionListener(new KnopListener());

        add(label);
        add(tekstvak);
        add(knopOk);
    }

    public void paint (Graphics g) {

        g.drawString("Bedrag inclusief BTW: € " + berekendBedrag, 50, 80);
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input = tekstvak.getText();
            bedrag = Double.parseDouble(input);
            berekendBedrag = bedrag + ((bedrag / 100) * btw);
            berekendBedrag = berekendBedrag * 100;
            doubleToInt = (int) berekendBedrag;
            berekendBedrag = doubleToInt;
            berekendBedrag = berekendBedrag / 100;
            repaint();
        }
    }

    class KnopListener implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input = tekstvak.getText();
            bedrag = Double.parseDouble(input);
            berekendBedrag = bedrag + ((bedrag / 100) * btw);
            berekendBedrag = berekendBedrag * 100;
            doubleToInt = (int) berekendBedrag;
            berekendBedrag = doubleToInt;
            berekendBedrag = berekendBedrag / 100;
            repaint();
        }
    }
}
