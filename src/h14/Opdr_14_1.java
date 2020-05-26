package h14;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_14_1 extends Applet {

    Button knop;

    /*String kaarten[] = {"Ruiten aas","Ruiten 2","Ruiten 3","Ruiten 4","Ruiten 5","Ruiten 6","Ruiten 7",
                          "Ruiten 8","Ruiten 9","Ruiten 10","Ruiten boer","Ruiten vrouw","Ruiten heer"};*/

    String kaarten[][] = {{"Schoppen aas","Schoppen 2","Schoppen 3","Schoppen 4","Schoppen 5","Schoppen 6","Schoppen 7","Schoppen 8","Schoppen 9","Schoppen 10","Schoppen boer","Schoppen vrouw","Schoppen heer"},
            {"Harten aas","Harten 2","Harten 3","Harten 4","Harten 5","Harten 6","Harten 7","Harten 8","Harten 9","Harten 10","Harten boer","Harten vrouw","Harten heer"},
            {"Klaver aas","Klaver 2","Klaver 3","Klaver 4","Klaver 5","Klaver 6","Klaver 7","Klaver 8","Klaver 9","Klaver 10","Klaver boer","Klaver vrouw","Klaver heer"},
            {"Ruiten aas","Ruiten 2","Ruiten 3","Ruiten 4","Ruiten 5","Ruiten 6","Ruiten 7","Ruiten 8","Ruiten 9","Ruiten 10","Ruiten boer","Ruiten vrouw","Ruiten heer"}};

    double r;
    int type;
    int kaart;


    public void init () {
        setSize(400, 300);

        knop = new Button("Nieuw nummer");
        knop.addActionListener(new KnopLis());
        add(knop);
    }

    public void paint (Graphics g) {
        g.drawString("Kaart type: " + type, 20, 100);
        g.drawString("Kaart nummer: " + kaart, 20, 120);
        g.drawString("Je hebt: " + kaarten[type][kaart], 20, 160);
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            //dit kiest het type kaart
            r = Math.random();
            type = (int) (r * 4 + 0);

            //dit kiest de kaart
            r = Math.random();
            kaart = (int) (r * 13 + 0);
            repaint();
        }
    }
}
