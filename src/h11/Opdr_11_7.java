package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_7 extends Applet {

    int posX = 40, posY = 20;
    int width = 500, height = 500;


    public void init () {
        setSize(600, 550);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < 50; i++) {
            g.drawOval(posX, posY, width, height);

            posX += 5;
            posY += 5;
            width -= 10;
            height -= 10;
        }
    }
}
