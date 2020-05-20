package h13;

import java.awt.*;
import java.applet.*;

public class Opdr_13_1 extends Applet {

    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {

        tekenDriehoek(g, 40, 100, 70, 50, 100, 100);
        tekenDriehoek(g, 40, 110, 70, 160, 100, 110);
    }


    void tekenDriehoek (Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);
    }
}
