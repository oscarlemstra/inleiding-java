package h11;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_11_8 extends Applet {

    int width = 10, height = 10;


    public void init () {
        setSize(600, 600);
    }

    public void paint (Graphics g) {

        for (int i = 0; i < 100; i++) {
            g.drawOval(20, 20, width, height);

            width += 5;
            height += 5;
        }

        g.drawString("TOOOOOOOOET!", 450, 500);
    }
}
