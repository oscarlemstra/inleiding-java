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
    boolean beurt = true; //true = speler, false = computer
    String computerTekst = "";
    String spelerTekst = "Aantal knopen: " + aantalKnopen + ". Jouw beurt.";


    public void init () {
        setSize(380, 400);

        label = new Label("Hoeveel knopen neem je 1, 2 of 3?");
        tekstvak = new TextField("", 8);
        knop = new Button("Speel");
        knop.addActionListener(new KnopLis());

        add(label);
        add(tekstvak);
        add(knop);

        pad = PraktijkOpdr_14.class.getResource("./resources/");
        knoop = getImage(pad, "knoop.jpg");
    }

    public void paint (Graphics g) {

        int posX = 20, posY = 90;
        int breedte = 40, hoogte = 40;
        int startPosX = posX;
        int positionPlus = 50;
        int rijen = 4;

        for (int i = 0; i < aantalKnopen; i++) {
            g.drawImage(knoop, posX, posY, breedte, hoogte, this);
            posX += positionPlus;

            if (posX == positionPlus * rijen + startPosX) {
                posX = startPosX;
                posY += positionPlus;
            }
        }


        g.drawString(computerTekst, 20, 50);
        g.drawString(spelerTekst, 20, 70);
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            int spelerZet;

            //reset het spel
            if (aantalKnopen <= 0) {
                aantalKnopen = 23;
                computerTekst = "";
                spelerTekst = "Aantal knopen: " + aantalKnopen + ". Jouw beurt.";
                tekstvak.setText("");
                repaint();
            }

            //spel verwerking
            spelerZet = Integer.parseInt(tekstvak.getText());

            if (spelerZet >= 1 && spelerZet <= 3) {
                aantalKnopen -= spelerZet;
                aantalKnopen -= zetVanComputer();

                spelerTekst = "Aantal knopen: " + aantalKnopen + ". Jouw beurt.";
            }
            else {
                computerTekst = "";
                spelerTekst = "Deze zet mag niet, doe het opnieuw.";
            }


            //checkt wie gewonnen heeft
            if (aantalKnopen <= 0) {
                if (beurt) {
                    computerTekst = "De computer heeft gewonnen.";
                    spelerTekst = "Als je opnieuw wilt spelen druk op speel.";
                }

                if (!beurt) {
                    computerTekst = "Jij hebt gewonnen.";
                    spelerTekst = "Als je opnieuw wilt spelen druk op speel.";
                }
            }

            repaint();
        }
    }


    //methodes
    int zetVanComputer () {

        int computerZet = 0;


        if (aantalKnopen % 4 == 1) {
            computerZet = (int) (Math.random() * 3 + 1);
        }
        else if (aantalKnopen - 1 == ((aantalKnopen - 1) % 4) * aantalKnopen - 1) {
            computerZet = 1;
        }
        else if (aantalKnopen - 2 == ((aantalKnopen - 2) % 4) * aantalKnopen - 2) {
            computerZet = 2;
        }
        else if (aantalKnopen - 3 == ((aantalKnopen - 3) % 4) * aantalKnopen - 3) {
            computerZet = 3;
        }

        //kijkt wie aan de beurt was
        if (aantalKnopen < 1) {
            beurt = true;
        }
        else {
            beurt = false;
        }

        computerTekst = "De computer heeft " + computerZet + " smileys weggehaald.";
        return computerZet;
    }//end method
}
