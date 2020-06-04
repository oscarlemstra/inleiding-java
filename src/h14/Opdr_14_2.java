package h14;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.URL;

public class Opdr_14_2 extends Applet {

    URL pad;
    AudioClip sound;

    Button knop;

    String[] kaartType = {"Schoppen ", "Harten ", "Klaver ", "Ruiten "};
    String[] kaartWaarde = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer"};

    String[] speler1, speler2, speler3, speler4;
    String[] deck;

    boolean showText = false;


    public void init () {
        setSize(450, 400);

        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        deck = new String[52];

        knop = new Button("Verdeel kaarten");
        knop.addActionListener(new KnopLis());
        add(knop);

        pad = Opdr_14_2.class.getResource("./resources/");
        sound = getAudioClip(pad, "1234.au");
    }

    public void paint (Graphics g) {

        g.drawString("Speler 1", 20, 100);
        g.drawString("Speler 2", 120, 100);
        g.drawString("Speler 3", 220, 100);
        g.drawString("Speler 4", 320, 100);

        if (showText == true) {
            int posY = 125;

            for (int i = 0; i < speler1.length; i++) {
                g.drawString(speler1[i], 20, posY);
                g.drawString(speler2[i], 120, posY);
                g.drawString(speler3[i], 220, posY);
                g.drawString(speler4[i], 320, posY);

                posY += 15;
            }
        }
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            kaartVerdeler();
            showText = true;

            repaint();
        }
    }


    //methodes
    void kaartVerdeler () {

        int index = 0;

        for (int i = 0; i < 4; i++) {
            for (int t = 0; t < speler1.length; t++) {
                deck[index] = kaartType[i] + kaartWaarde[t];
                index++;
            }
        }

        for (int i = 0; i < speler1.length; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }

        sound.play();
    }//end method


    String deelKaart() {

        int random = (int) (Math.random() * deck.length + 0);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;

        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }

        deck = hulpLijst;
        return kaart;
    }//end method
}
