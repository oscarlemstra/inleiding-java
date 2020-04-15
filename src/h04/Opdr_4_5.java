package h04;

import java.awt.*;
import java.applet.*;

public class Opdr_4_5 extends Applet {

    public void init () {
        setSize(400, 300);
    }

    public void paint (Graphics g) {
        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.fillArc(50, 50, 100, 100, 0, 180);
    }
}
