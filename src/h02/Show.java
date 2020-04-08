package h02;

//test

/* test
* test */

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init () {
        setBackground(Color.magenta);
    }

    public void paint (Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 50, 60);
    }
}
