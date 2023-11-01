package classes;

import interfaces.Arma;

import javax.swing.*;

public class Espada implements Arma {
    private double peso;
    public ImageIcon usar() {
        return new ImageIcon("./images/espadaimg.jpg");
    }
}
