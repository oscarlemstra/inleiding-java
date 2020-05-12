package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_9 extends Applet {

    int posX1 = 20, posX2 = 60, posY = 20;
    int teller = 0, rijTeller = 0;
    boolean schakelaar = true;


    public void init () {
        setSize(400, 400);
    }

    public void paint (Graphics g) {

        g.drawRect(19, 19, 321, 321);

        while (rijTeller < 8) {

            if (schakelaar == true) {
                for (teller = 0; teller < 4; teller++) {
                    g.setColor(Color.black);
                    g.fillRect(posX1, posY, 40, 40);
                    g.setColor(Color.white);
                    g.fillRect(posX2, posY, 40, 40);

                    posX1 += 80;
                    posX2 += 80;

                    schakelaar = false;
                }
            }
            else {
                for (teller = 0; teller < 4; teller++) {
                    g.setColor(Color.white);
                    g.fillRect(posX1, posY, 40, 40);
                    g.setColor(Color.black);
                    g.fillRect(posX2, posY, 40, 40);

                    posX1 += 80;
                    posX2 += 80;

                    schakelaar = true;
                }
            }

            if (teller == 4) {
                posY += 40;
                posX1 = 20;
                posX2 = 60;
                rijTeller += 1;
                teller = 0;
            }
        }
    }
}
