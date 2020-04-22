package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Test2 extends Applet {
    TextField tekstvak;
    Label label;
    int getal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Integer.parseInt(s);
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            repaint();
        }
    }
}