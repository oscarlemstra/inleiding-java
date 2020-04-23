package h06;

import java.awt.*;
import java.applet.*;

public class Opdr_6_1 extends Applet {

    double verdiendeGeld = 113.00;
    double bedragPerPersoon;


    public void init () {
        setSize(400, 300);

        bedragPerPersoon = verdiendeGeld / 4;
    }

    public void paint (Graphics g) {

        g.drawString("Jan krijgt: € " + bedragPerPersoon, 30, 50);
        g.drawString("Ali krijgt: € " + bedragPerPersoon, 30, 70);
        g.drawString("Jeannette krijgt: € " + bedragPerPersoon, 30, 90);
        g.drawString("Ik krijg: € " + bedragPerPersoon, 30, 110);
    }
}
