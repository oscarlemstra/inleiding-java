package h04;

import java.awt.*;
import java.applet.*;

public class Opdr_4_2 extends Applet {

    public void init () {
    }

    public void paint(Graphics g) {
        setBackground(Color.green);
        g.setColor(Color.red);

        //house
        g.drawRect(20, 100, 80, 50);

        //roof
        g.drawLine(20, 100, 60, 60);
        g.drawLine(60, 60, 100, 100);

        //door
        g.drawRect(30, 130, 15, 20);
        g.fillOval(40, 139, 3,3);

        //window's
        g.drawRect(70, 110, 20, 10);
        g.drawRect(30, 110, 20, 10);
    }
}
