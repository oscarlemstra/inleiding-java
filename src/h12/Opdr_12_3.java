package h12;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*;

public class Opdr_12_3 extends Applet {

    TextField[] tekstvakken;
    Button knop;
    int[] getallen;
    String[] input;


    public void init () {
        setSize(400, 300);

        tekstvakken = new TextField[5];
        getallen = new int[5];
        input = new String[5];

        for (int i = 0; i < tekstvakken.length; i++) {
            tekstvakken[i] = new TextField("", 5);
            add(tekstvakken[i]);
        }

        knop = new Button("Ok");
        knop.addActionListener(new KnopLis());
        add(knop);
    }

    public void paint (Graphics g) {
        
    }


    class KnopLis implements ActionListener {

        public void actionPerformed (ActionEvent e) {

            for (int i = 0; i < tekstvakken.length; i++) {
                input[i] = tekstvakken[i].getText();
                getallen[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(getallen);

            for (int i = 0; i < tekstvakken.length; i++) {
                tekstvakken[i].setText("" + getallen[i]);
            }

            repaint();
        }
    }
}
