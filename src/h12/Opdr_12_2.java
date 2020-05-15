package h12;

import java.awt.*;
import java.applet.*;

public class Opdr_12_2 extends Applet {

    Button[] knop;


    public void init () {
        setSize(400, 300);

        knop = new Button[25];

        for (int i = 0; i < knop.length; i++) {
            knop[i] = new Button("Oke");
            add(knop[i]);
        }

    }

    public void paint (Graphics g) {

    }
}
