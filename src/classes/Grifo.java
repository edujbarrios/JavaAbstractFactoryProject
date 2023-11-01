package classes;

import interfaces.Mascota;
import javax.swing.*;

public class Grifo implements Mascota {
    private double envergaduraAlas; 
    public ImageIcon acompanar() {
        return new ImageIcon("./images/grifoimg.jpg");
    }
}
