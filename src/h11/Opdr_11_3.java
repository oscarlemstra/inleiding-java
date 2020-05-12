package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_3 extends Applet {

    int posX = 20;
    int cijfer1 = 1, cijfer2 = 1;


    public void init () {
        setSize(500, 200);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < 8; i++) {
            g.drawString("" + cijfer1, posX, 100);
            posX += 30;
            g.drawString("" + cijfer2, posX, 100);
            posX += 30;

            cijfer1 = cijfer1 + cijfer2;
            cijfer2 = cijfer2 + cijfer1;
        }
    }
}
