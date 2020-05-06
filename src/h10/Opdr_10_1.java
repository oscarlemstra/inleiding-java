package h10;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_10_1 extends Applet {

    public TextField tekstvak;



    public void init () {
        setSize(400, 300);
        tekstvak = new TextField("", 20);

        add(tekstvak);
    }

    public void paint (Graphics g) {

    }


}
