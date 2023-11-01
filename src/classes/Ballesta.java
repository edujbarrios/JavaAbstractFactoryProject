package classes;

import interfaces.Arma;
import javax.swing.*;

public class Ballesta implements Arma {
    private double alcance;
    public ImageIcon usar() {
        return new ImageIcon("./factory_methods_java/images/ballestaimg.jpg");
    }
}
