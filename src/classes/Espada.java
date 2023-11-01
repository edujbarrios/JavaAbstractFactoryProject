package classes;

import interfaces.Arma;

import javax.swing.*;

public class Espada implements Arma {
    private double peso;
    public ImageIcon usar() {
        return new ImageIcon("./factory_methods_java/images/espadaimg.jpg");
    }
}
