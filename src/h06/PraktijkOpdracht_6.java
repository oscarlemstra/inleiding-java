package h06;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht_6 extends Applet {

    double cijfer1 = 5.9;
    double cijfer2 = 6.3;
    double cijfer3 = 6.9;

    double gemiddelde;
    int intGemiddelde;


    public void init () {
        setSize(350, 300);

        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        gemiddelde = gemiddelde * 10;
        intGemiddelde = (int) gemiddelde;
        gemiddelde = intGemiddelde;
        gemiddelde = gemiddelde / 10;
    }

    public void paint (Graphics g) {

        g.drawString("Het gemiddelde is: " + gemiddelde, 30, 50);
    }
}
