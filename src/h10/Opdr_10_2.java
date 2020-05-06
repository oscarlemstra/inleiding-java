package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_10_2 extends Applet {

    Label label;
    TextField tekstvak;

    int getal, laagsteGetal, hoogsteGetal;
    String input = "", outputLaag = "", outputHoog = "";
    boolean setOutputLaag = true;


    public void init () {
        setSize(400, 300);
        label = new Label("Type een getal in en druk op enter");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakLis());

        add(label);
        add(tekstvak);
    }

    public void paint (Graphics g) {

        outputHoog = "" + hoogsteGetal;
        outputLaag = "" + laagsteGetal;
        g.drawString("Hoogste getal is: " + outputHoog, 20, 100);
        g.drawString("Laagste getal is: " + outputLaag, 20, 120);
    }

    class TekstvakLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input = tekstvak.getText();
            getal = Integer.parseInt(input);

            if (getal > hoogsteGetal) {
                hoogsteGetal = getal;
            }

            if (setOutputLaag == true) {
                laagsteGetal = hoogsteGetal;
                setOutputLaag = false;
            }

            if (getal < laagsteGetal) {
                laagsteGetal = getal;
            }
            repaint();
        }
    }
}
