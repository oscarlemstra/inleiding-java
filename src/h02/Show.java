package h02;

import java.awt.*;
import java.applet.*;

//opdr 2.1

public class Show extends Applet {

    public void init () {
        setBackground(Color.blue);
    }

    public void paint (Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Oscar Lemstra", 50, 60);
    }
}
