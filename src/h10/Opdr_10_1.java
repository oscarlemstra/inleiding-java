package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_10_1 extends Applet {

    Label label;
    TextField tekstvak;

    int getal, hoogsteGetal;
    String input = "", output = "";


    public void init () {
        setSize(400, 300);
        label = new Label("Type een getal in en druk op enter");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakLis());

        add(label);
        add(tekstvak);
    }

    public void paint (Graphics g) {

        output = "" + hoogsteGetal;
        g.drawString("Hoogste getal is: " + output, 20, 100);
    }

    class TekstvakLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input = tekstvak.getText();
            getal = Integer.parseInt(input);

            if (getal > hoogsteGetal) {
                hoogsteGetal = getal;
            }
            repaint();
        }
    }
}
