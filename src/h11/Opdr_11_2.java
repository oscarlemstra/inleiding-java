package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_2 extends Applet {

    int posX = 20;
    int cijfer = 20;


    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {

        for (int i = 20; i >= 10; i--) {
            g.drawString("" + cijfer, posX, 100);
            posX += 20;
            cijfer -= 1;
        }
    }
}
