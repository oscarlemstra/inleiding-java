package h12;

import java.awt.*;
import java.applet.*;

public class Opdr_12_1 extends Applet {

    double[] cijfers = {8.3, 5.6, 9.1, 5.6, 7.7, 10.0, 8.4, 6.5, 6.7, 7.8};
    double getal, gemidelde;
    int doubleToInt;
    int posY = 60;

    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < cijfers.length; i++) {
            getal = getal + cijfers[i];
        }
        gemidelde = getal / cijfers.length;

        gemidelde = gemidelde * 10;
        doubleToInt = (int) gemidelde;
        gemidelde = doubleToInt;
        gemidelde = gemidelde / 10;

        //tekst
        g.drawString("Je cijfers", 20, 40);
        for (int i = 0; i < cijfers.length; i++) {
            g.drawString("" + cijfers[i], 35, posY);
            posY += 20;
        }

        g.drawString("Je gemidelde", 100, 40);
        g.drawString("" + gemidelde, 130, 60);
    }
}
