package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_8_2 extends Applet {

    Button manKnop;
    Button vrouwKnop;
    Button potManKnop;
    Button potVrouwKnop;

    int manTel, vrouwTel, potManTel, potVrouwTel;
    int bezoekersTotaal;


    public void init () {
        setSize(400, 300);

        manKnop = new Button("+1 Man");
        manKnop.addActionListener(new KnopLisMan());

        vrouwKnop = new Button("+1 Vrouw");
        vrouwKnop.addActionListener(new KnopLisVrouw());

        potManKnop = new Button("+1 Potentiële man");
        potManKnop.addActionListener(new KnopLisPotMan());

        potVrouwKnop = new Button("+1 Potentiële vrouw");
        potVrouwKnop.addActionListener(new KnopLisPotVrouw());

        add(manKnop);
        add(vrouwKnop);
        add(potManKnop);
        add(potVrouwKnop);

        //bezoekersTotaal = manTel + vrouwTel + potManTel + potVrouwTel;
    }

    public void paint (Graphics g) {

        g.drawString("Aantal mannen: " + manTel, 20, 60);
        g.drawString("Aantal vrouwen: " + vrouwTel, 20, 80);
        g.drawString("Aantal potentiële mannen: " + potManTel, 20, 100);
        g.drawString("Aantal potentiële Vrouwen: " + potVrouwTel, 20, 120);

        g.drawString("Aantal bezoekers: " + bezoekersTotaal, 20, 150);
    }

    class KnopLisMan implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            manTel++;
            bezoekersTotaal = manTel + vrouwTel + potManTel + potVrouwTel;
            repaint();
        }
    }

    class KnopLisVrouw implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            vrouwTel++;
            bezoekersTotaal = manTel + vrouwTel + potManTel + potVrouwTel;
            repaint();
        }
    }

    class KnopLisPotMan implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            potManTel++;
            bezoekersTotaal = manTel + vrouwTel + potManTel + potVrouwTel;
            repaint();
        }
    }

    class KnopLisPotVrouw implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            potVrouwTel++;
            bezoekersTotaal = manTel + vrouwTel + potManTel + potVrouwTel;
            repaint();
        }
    }
}
