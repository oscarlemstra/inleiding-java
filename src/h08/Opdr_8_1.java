package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_8_1 extends Applet {

    Label label;
    TextField tekstvak;
    Button knopOk;
    Button knopReset;

    String input;
    String output;


    public void init () {
        setSize(400, 300);

        label = new Label("Type iets");
        tekstvak = new TextField("", 20);
        knopOk = new Button ("Ok");
        knopOk.addActionListener(new KnopListenerOk());
        knopReset = new Button("Reset");
        knopReset.addActionListener(new KnopListenerReset());

        add(label);
        add(tekstvak);
        add(knopOk);
        add(knopReset);
    }

    public void paint (Graphics g) {
        g.drawString(output, 80, 70);
    }

    class KnopListenerOk implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            input = tekstvak.getText();
            output = input;
            repaint();
        }
    }

    class KnopListenerReset implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            tekstvak.setText(input = "");
            repaint();
        }
    }
}
