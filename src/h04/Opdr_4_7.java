package h04;

import java.awt.*;
import java.applet.*;

public class Opdr_4_7 extends Applet {

    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {
        setBackground(Color.green);

        g.setColor(Color.white);
        g.fillRoundRect(100, 100, 50, 50, 20, 20);
        g.setColor(Color.black);
        g.fillOval(110, 110, 10, 10);
        g.fillOval(130, 110, 10, 10);
        g.fillOval(110, 130, 10, 10);
        g.fillOval(130, 130, 10, 10);
    }
}
