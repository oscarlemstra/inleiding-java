package h04;

import java.awt.*;
import java.applet.*;

public class Opdr_4_3 extends Applet {

    public void init () {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);

        //stick
        g.setColor(Color.lightGray);
        g.fillRect(50, 50, 5, 200);
        g.setColor(Color.red);
        g.fillOval(45, 45, 15, 10);

        //flag
        g.setColor(Color.red);
        g.fillRect(55, 60, 150, 30);
        g.setColor(Color.white);
        g.fillRect(55, 90, 150, 30);
        g.setColor(Color.blue);
        g.fillRect(55, 120, 150, 30);
    }
}
