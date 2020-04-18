package h06;

import java.awt.*;
import java.applet.*;

public class Opdr_6_3 extends Applet {

    int a = 2147483647;
    int b = 5;

    int resultaat;


    public void init () {
        setSize(400, 300);

        resultaat = a + b;
    }

    public void paint (Graphics g) {
        g.drawString("een negatieve int:  " + resultaat, 30, 50);
    }
}
