package classes;

import interfaces.Personaje;
import javax.swing.*;

public class Heroe implements Personaje {
    private int nivelDeBondad; 
    public ImageIcon atacar() {
        return new ImageIcon("./images/heroeimg.jpg");
    }
}
