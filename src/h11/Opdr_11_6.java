package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_6 extends Applet {

    int posX = 20, posY = 40;
    int width = 100, height = 100;


    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < 5; i++) {
            g.drawOval(posX, posY, width, height);

            posX += 10;
            posY += 10;
            width -= 20;
            height -= 20;
        }
    }
}
