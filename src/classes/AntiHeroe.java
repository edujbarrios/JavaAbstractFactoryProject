package classes;

import interfaces.Personaje;
import javax.swing.*;

public class AntiHeroe implements Personaje {
    private int nivelDeConflicto;
    public ImageIcon atacar() {
        return new ImageIcon("./images/antiheroeimg.jpg");
    }
}
