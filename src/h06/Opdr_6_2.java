package h06;

import java.awt.*;
import java.applet.*;

public class Opdr_6_2 extends Applet {

    int secMinut = 60;
    int minUur = 60;
    int uurDag = 24;
    int dagJaar = 365;

    int secUur, secDag, secJaar;

    public void init () {
        setSize(350, 300);

        secUur = secMinut * minUur;
        secDag = secUur * uurDag;
        secJaar = secDag * dagJaar;
    }

    public void paint (Graphics g) {

        g.drawString("seconden in een uur: " + secUur, 30, 50);
        g.drawString("seconden in een dag: " + secDag, 30, 70);
        g.drawString("seconden in een jaar: " + secJaar, 30, 90);
    }
}
