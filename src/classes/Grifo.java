package classes;

import interfaces.Mascota;
import javax.swing.*;

public class Grifo implements Mascota {
    private double envergaduraAlas; 
    public ImageIcon acompanar() {
        return new ImageIcon("./factory_methods_java/images/grifoimg.jpg");
    }
}
