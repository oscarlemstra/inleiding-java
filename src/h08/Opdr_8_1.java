package h08;

import java.awt.*;
import java.applet.*;

public class Opdr_8_1 extends Applet {

    Button knop;


    public void init () {
        setSize(400, 300);

        knop = new Button();
        knop.setLabel( "Klik op mij" );
        add(knop);
    }

    public void paint (Graphics g) {

    }
}
