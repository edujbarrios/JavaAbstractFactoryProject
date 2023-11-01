package classes;

import interfaces.Personaje;
import javax.swing.*;

public class AntiHeroe implements Personaje {
    private int nivelDeConflicto;
    public ImageIcon atacar() {
        return new ImageIcon("./factory_methods_java/images/antiheroeimg.jpg");
    }
}
