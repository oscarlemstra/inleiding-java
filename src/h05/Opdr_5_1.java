package h05;

import java.awt.*;
import java.applet.*;

public class Opdr_5_1 extends Applet {

    Color lineColor = Color.black;
    Color fillColor = Color.magenta;

    int width = 180;
    int height = 100;

    int PosX1 = 20;
    int PosX2 = 220;
    int PosX3 = 420;

    int PosY1 = 60;
    int PosY2 = 200;


    public void init () {
        setSize(700, 400);
    }

    public void paint (Graphics g) {
        setBackground(Color.white);

        //lijn
        g.setColor(lineColor);
        g.drawLine(PosX1, 20, 200, 20);
        g.drawString("Lijn", 100, 40);

        //rechthoek
        g.setColor(lineColor);
        g.drawRect(PosX1, PosY1, width, height);
        g.drawString("Rechthoek", 80, 180);

        //afgeronde rechthoek
        g.setColor(lineColor);
        g.drawRoundRect(PosX1, PosY2, width, height, 30, 30);
        g.drawString("Afgeronde rechthoek", 50, 320);

        //gevulde rechthoek met ovaal
        g.setColor(fillColor);
        g.fillRect(PosX2, PosY1, width, height);
        g.setColor(lineColor);
        g.drawOval(PosX2, PosY1, width, height);
        g.drawString("Gevulde rechthoek met ovaal", 230, 180);

        //gevulde ovaal
        g.setColor(fillColor);
        g.fillOval(PosX2, PosY2, width, height);
        g.setColor(lineColor);
        g.drawString("Gevulde ovaal", 270, 320);

        //taartpunt met ovaal eromheen
        g.setColor(fillColor);
        g.fillArc(PosX3, PosY1, width, height, 0, 45);
        g.setColor(lineColor);
        g.drawOval(PosX3, PosY1, width, height);
        g.drawString("Taartpunt met ovaal eromheen", 430, 180);

        //cirkel
        g.setColor(lineColor);
        g.drawOval(460, PosY2, 100, 100);
        g.drawString("Cirkel", 495, 320);
    }
}
