package h04;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdr_4 extends Applet {

    public void init () {
        setSize(700, 400);
    }

    public void paint (Graphics g) {
        setBackground(Color.white);

        //lijn
        g.setColor(Color.black);
        g.drawLine(20, 20, 200, 20);
        g.drawString("Lijn", 100, 40);

        //rechthoek
        g.setColor(Color.black);
        g.drawRect(20, 60, 180, 100);
        g.drawString("Rechthoek", 80, 180);

        //afgeronde rechthoek
        g.setColor(Color.black);
        g.drawRoundRect(20, 200, 180, 100, 30, 30);
        g.drawString("Afgeronde rechthoek", 50, 320);

        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(220, 60, 180, 100);
        g.setColor(Color.black);
        g.drawOval(220, 60, 180, 100);
        g.drawString("Gevulde rechthoek met ovaal", 230, 180);

        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(220, 200, 180, 100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 270, 320);

        //taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(420, 60, 180, 100, 0, 45);
        g.setColor(Color.black);
        g.drawOval(420, 60, 180, 100);
        g.drawString("Taartpunt met ovaal eromheen", 430, 180);

        //cirkel
        g.setColor(Color.black);
        g.drawOval(460, 200, 100, 100);
        g.drawString("Cirkel", 495, 320);
    }
}
