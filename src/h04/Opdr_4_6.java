package h04;

import java.awt.*;
import java.applet.*;

public class Opdr_4_6 extends Applet {

    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {
        setBackground(Color.white);

        g.setColor(Color.gray);
        g.fillRect(193, 240, 14, 100);

        g.setColor(Color.lightGray);
        g.fillRoundRect(150, 50, 100, 200, 100, 100);

        g.setColor(Color.black);
        g.fillRoundRect(157, 57, 85, 185, 100, 100);

        //light's
        g.setColor(Color.red);
        g.fillOval(180, 80, 40, 40);

        g.setColor(Color.orange);
        g.fillOval(180, 130, 40, 40);

        g.setColor(Color.green);
        g.fillOval(180, 180, 40, 40);
    }
}
