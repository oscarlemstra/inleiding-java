package h02;

import java.awt.*;
import java.applet.*;

//opdr 2.2

public class Show2 extends Applet {

    public void init () {
        setBackground(Color.white);
    }

    public void paint (Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Oscar", 50, 60);

        g.setColor(Color.red);
        g.drawString("Lemstra", 50, 70);
    }
}
