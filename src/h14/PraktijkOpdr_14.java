package h14;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.URL;

public class PraktijkOpdr_14 extends Applet {

    URL pad;
    Image knoop;

    Label label;
    TextField tekstvak;
    Button knop;

    int aantalKnopen = 23;
    int[] posX = {20,70,120,170, 20,70,120,170, 20,70,120,170, 20,70,120,170, 20,70,120,170, 20,70,120};
    int[] posY = {40,40,40,40, 90,90,90,90, 140,140,140,140, 190,190,190,190, 240,240,240,240, 290,290,290};
    boolean gewonnen = false;
    String input;


    public void init () {
        setSize(400, 400);

        label = new Label("Hoeveel knopen neem je 1, 2 of 3?");
        tekstvak = new TextField("", 10);
        knop = new Button("Speel");
        knop.addActionListener(new KnopLis());

        add(label);
        add(tekstvak);
        add(knop);

        pad = PraktijkOpdr_14.class.getResource("./resources/");
        knoop = getImage(pad, "knoop.jpg");
    }

    public void paint (Graphics g) {

        for (int i = 0; i < aantalKnopen; i++) {
            g.drawImage(knoop, posX[i], posY[i],this);
        }
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            repaint();
        }
    }
}
