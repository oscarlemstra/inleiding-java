package h13;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdr_13 extends Applet {

    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {

        tekenBomen(g, 10);
    }


    void tekenBomen (Graphics g, int aantal) {

        int i;
        int posX1 = 40, posY1 = 60;
        int posX2 = 20, posY2 = 20;
        Color green = new Color(46, 155, 24);
        Color brown = new Color(139,69,19);

        if (aantal >= 15) {
            aantal = 15;
        }

        for (i = 0; i < aantal; i++) {
            g.setColor(brown);
            g.fillRect(posX1, posY1, 10, 40);
            g.setColor(green);
            g.fillOval(posX2, posY2, 50, 50);

            posX1 += 55;
            posX2 += 55;

            if (i == 5 - 1 || i == 10 - 1 || i == 15 - 1) {
                posX1 = 40;
                posX2 = 20;

                posY1 += 90;
                posY2 += 90;
            }
        }
    }
}
