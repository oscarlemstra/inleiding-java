package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PraktijkOpdracht_8 extends Applet {

    TextField tekstvak1, tekstvak2;
    Button knop1, knop2, knop3, knop4;

    String input1, input2, output;
    double getal1, getal2, resultaat;

    public void init () {
        setSize(400,300);

        tekstvak1 = new TextField("", 12);
        tekstvak2 = new TextField("", 12);

        knop1 = new Button("*");
        knop1.addActionListener(new KnopLis1());

        knop2 = new Button("/");
        knop2.addActionListener(new KnopLis2());

        knop3 = new Button("+");
        knop3.addActionListener(new KnopLis3());

        knop4 = new Button("-");
        knop4.addActionListener(new KnopLis4());

        add(tekstvak1);
        add(tekstvak2);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }

    public void paint (Graphics g) {

    }

    //dit is vermenigvuldigen
    class KnopLis1 implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);

            resultaat = getal1 * getal2;
            output = "" + resultaat;

            tekstvak1.setText(output);
            tekstvak2.setText("");
            repaint();
        }
    }

    //dit is delen
    class KnopLis2 implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);

            resultaat = getal1 / getal2;
            output = "" + resultaat;

            tekstvak1.setText(output);
            tekstvak2.setText("");
            repaint();
        }
    }

    //dit is optellen
    class KnopLis3 implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);

            resultaat = getal1 + getal2;
            output = "" + resultaat;

            tekstvak1.setText(output);
            tekstvak2.setText("");
            repaint();
        }
    }

    //dit is aftrekken
    class KnopLis4 implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input1 = tekstvak1.getText();
            input2 = tekstvak2.getText();
            getal1 = Double.parseDouble(input1);
            getal2 = Double.parseDouble(input2);

            resultaat = getal1 - getal2;
            output = "" + resultaat;

            tekstvak1.setText(output);
            tekstvak2.setText("");
            repaint();
        }
    }
}
