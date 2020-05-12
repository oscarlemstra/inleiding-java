package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_1 extends Applet {

    int posX = 20;


    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < 10; i++) {
            g.drawLine(posX, 20, posX, 220);
            posX += 20;
        }
    }
}
