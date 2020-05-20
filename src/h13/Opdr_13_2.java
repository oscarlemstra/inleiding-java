package h13;

import java.awt.*;
import java.applet.*;

public class Opdr_13_2 extends Applet {

    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {

        tekenStenenMuur(g);
    }


    void tekenStenenMuur (Graphics g) {

        int posX = 20, posY = 50;


        for (int tel = 0; tel < 4; tel++) {

            for (int i = 0; i < 6; i++) {
                g.setColor(Color.red);
                g.fillRect(posX, posY, 40, 20);
                g.setColor(Color.black);
                g.drawRect(posX, posY, 40, 20);

                posX += 40;
            }

            posX = 20;
            posY += 20;

            g.setColor(Color.red);
            g.fillRect(posX, posY, 20, 20);
            g.setColor(Color.black);
            g.drawRect(posX, posY, 20, 20);

            posX = 40;

            for (int i = 0; i < 5; i++) {
                g.setColor(Color.red);
                g.fillRect(posX, posY, 40, 20);
                g.setColor(Color.black);
                g.drawRect(posX, posY, 40, 20);

                posX += 40;
            }

            g.setColor(Color.red);
            g.fillRect(posX, posY, 20, 20);
            g.setColor(Color.black);
            g.drawRect(posX, posY, 20, 20);

            posX = 20;
            posY += 20;
        }
    }
}
