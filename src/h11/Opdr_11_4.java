package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_4 extends Applet {

    //verander cijfer1 om de tafel te veranderen :)
    int cijfer1 = 3, cijfer2 = 1, resultaat;
    int posY = 40;


    public void init () {
        setSize(350, 300);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < 10; i++) {
            resultaat = cijfer1 * cijfer2;
            g.drawString("" + cijfer1 + " x " + cijfer2 + " = " + resultaat, 20, posY);
            posY += 20;
            cijfer2 += 1;
        }
    }
}
