package h04;

import java.awt.*;
import java.applet.*;

public class Opdr_4_4 extends Applet {

    public void init () {
        setSize(600, 400);
    }

    public void paint (Graphics g) {
        setBackground(Color.white);

        //diagram
        g.setColor(Color.lightGray);
        g.fillRect(100, 100, 400, 210);
        //lijnen
        g.setColor(Color.black);
        g.drawLine(100, 100, 100, 310);
        g.drawLine(95, 310, 500, 310);
        //tussen lijnen
        g.drawLine(95, 100, 100, 100);
        g.drawLine(95, 135, 499, 135);
        g.drawLine(95, 170, 499, 170);
        g.drawLine(95, 205, 499, 205);
        g.drawLine(95, 240, 499, 240);
        g.drawLine(95, 275, 499, 275);

        //schaal
        g.drawString("0", 82, 310);
        g.drawString("20", 75, 275);
        g.drawString("40", 75, 240);
        g.drawString("60", 75, 205);
        g.drawString("80", 75, 170);
        g.drawString("100", 68, 135);
        g.drawString("120", 68, 100);
        g.drawString("Gewicht van de kinderen in kg.", 150, 50);

        //valerie
        g.setColor(Color.black);
        g.drawString("Valerie", 140,325);
        g.setColor(Color.green);
        g.fillRect(140, 240, 30, 70);

        //jeroen
        g.setColor(Color.black);
        g.drawString("Jeroen", 240,325);
        g.setColor(Color.red);
        g.fillRect(240, 135, 30, 175);

        //hans
        g.setColor(Color.black);
        g.drawString("Hans", 340,325);
        g.setColor(Color.yellow);
        g.fillRect(340, 170, 30, 140);
    }
}
