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

        int posX = 20, posY = 100;
        int breedte = 40, hoogte = 40;
        int startPosX = posX;
        int positionPlus = 50;
        int rijen = 5;

        for (int i = 0; i < aantalKnopen; i++) {
            g.drawImage(knoop, posX, posY, breedte, hoogte, this);
            posX += positionPlus;

            if (posX == positionPlus * rijen + startPosX) {
                posX = startPosX;
                posY += positionPlus;
            }
        }
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            repaint();
        }
    }
}
