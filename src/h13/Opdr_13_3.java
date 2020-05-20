package h13;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdr_13_3 extends Applet {

    Button steenKnop, betonKnop;
    boolean steen = false, beton = false;


    public void init () {
        setSize(400, 300);

        steenKnop = new Button("Steen");
        steenKnop.addActionListener(new KnopLisSteen());

        betonKnop = new Button("Beton");
        betonKnop.addActionListener(new KnopLisBeton());

        add(steenKnop);
        add(betonKnop);
    }

    public void paint (Graphics g) {

        if (steen) {
            tekenStenenMuur(g);
        }

        if (beton) {
            tekenBetonMuur(g);
        }
    }


    //classes
    class KnopLisSteen implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            steen = true;
            beton = false;
            repaint();
        }
    }

    class KnopLisBeton implements ActionListener {

        public void actionPerformed (ActionEvent e) {
            beton = true;
            steen = false;
            repaint();
        }
    }


    //methodes
    void tekenStenenMuur (Graphics g) {

        int posX = 20, posY = 50;


        for (int tel = 0; tel < 4; tel++) {

            for (int i = 0; i < 6; i++) {
                g.setColor(Color.red);
                g.fillRect(posX, posY, 40, 20);
                g.setColor(Color.black);
                g.drawRect(posX, posY, 40, 20);

                posX += 40;
            }

            posX = 20;
            posY += 20;

            g.setColor(Color.red);
            g.fillRect(posX, posY, 20, 20);
            g.setColor(Color.black);
            g.drawRect(posX, posY, 20, 20);

            posX = 40;

            for (int i = 0; i < 5; i++) {
                g.setColor(Color.red);
                g.fillRect(posX, posY, 40, 20);
                g.setColor(Color.black);
                g.drawRect(posX, posY, 40, 20);

                posX += 40;
            }

            g.setColor(Color.red);
            g.fillRect(posX, posY, 20, 20);
            g.setColor(Color.black);
            g.drawRect(posX, posY, 20, 20);

            posX = 20;
            posY += 20;
        }
    }

    void tekenBetonMuur (Graphics g) {

        int posX = 20, posY = 50;


        for (int tel = 0; tel < 3; tel++) {

            for (int i = 0; i < 3; i++) {
                g.setColor(Color.gray);
                g.fillRect(posX, posY, 80, 40);
                g.setColor(Color.black);
                g.drawRect(posX, posY, 80, 40);

                posX += 80;
            }

            posX = 20;
            posY += 40;

            g.setColor(Color.gray);
            g.fillRect(posX, posY, 40, 40);
            g.setColor(Color.black);
            g.drawRect(posX, posY, 40, 40);

            posX = 60;

            for (int i = 0; i < 2; i++) {
                g.setColor(Color.gray);
                g.fillRect(posX, posY, 80, 40);
                g.setColor(Color.black);
                g.drawRect(posX, posY, 80, 40);

                posX += 80;
            }

            g.setColor(Color.gray);
            g.fillRect(posX, posY, 40, 40);
            g.setColor(Color.black);
            g.drawRect(posX, posY, 40, 40);

            posX = 20;
            posY += 40;
        }
    }
}
