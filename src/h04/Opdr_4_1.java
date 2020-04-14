package h04;

import java.awt.*;
import java.applet.*;

public class Opdr_4_1 extends Applet {

    public void init () {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);

        //g.drawLine(150, 20, 200, 60);

        //g.drawRoundRect(20, 20, 100, 50, 10, 50);
        //g.fillRoundRect(20, 80, 100, 50, 100, 100);

        //g.drawOval(20, 140, 50, 50);
        //g.fillOval(20, 200, 50, 50);

        //g.drawArc(20, 20, 100, 100, 0, 90);
        //g.fillArc(20, 80, 100, 100, 0, 90);

        g.drawLine(20, 100, 100, 100);
        g.drawLine(20, 100, 60, 40);
        g.drawLine(100, 100, 60, 40);
    }
}
