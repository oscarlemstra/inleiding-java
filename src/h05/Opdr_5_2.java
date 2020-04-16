package h05;

import java.awt.*;
import java.applet.*;

public class Opdr_5_2 extends Applet {

    //   0kg = 0
    //  20kg = 35
    //  40kg = 70
    //  80kg = 105
    // 100kg = 140
    // 120kg = 175
    int valerieKG = 70;
    int jeroenKG = 105;
    int hansKG = 140;

    int Pos0KG = 310;


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

        //valerie = 40kg
        g.setColor(Color.black);
        g.drawString("Valerie", 140,325);
        g.setColor(Color.green);
        g.fillRect(140, Pos0KG - valerieKG, 30, valerieKG);

        //jeroen = 100kg
        g.setColor(Color.black);
        g.drawString("Jeroen", 240,325);
        g.setColor(Color.red);
        g.fillRect(240, Pos0KG - jeroenKG, 30, jeroenKG);

        //hans = 80kg
        g.setColor(Color.black);
        g.drawString("Hans", 340,325);
        g.setColor(Color.yellow);
        g.fillRect(340, Pos0KG - hansKG, 30, hansKG);
    }
}
