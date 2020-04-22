package h08;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Test0 extends Applet {

    /*
    Button knop;
    String text1 = "Doet deze knop wel iets?";
     */

    Label label;
    TextField tekstvak;
    String s = "";


    public void init () {
        setSize(400, 300);

        /*
        //Button
        knop = new Button("Klik op mij");
        //knop.setLabel("Klik op mij");
        add(knop);

        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
         */

        //TextField
        label = new Label("Type iets in het  tekstvakje " + "en druk op enter");
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
    }

    public void paint (Graphics g) {

        //g.drawString("" + text, 50, 60 );
        g.drawString(s, 50, 60 );
    }

    class KnopListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //text = "Ja, deze knop doet wel iets";
            repaint();
        }
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
}
