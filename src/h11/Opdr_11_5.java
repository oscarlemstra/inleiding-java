package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_5 extends Applet {

    int posX = 20, posY = 40;


    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < 5; i++) {
            g.drawRect(posX, posY, 20, 20);
            posX += 20;
            posY += 20;
        }
    }
}
