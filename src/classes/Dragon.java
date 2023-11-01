package classes;

import interfaces.Mascota;

import javax.swing.*;

public class Dragon implements Mascota {
    private String colorDeFuego; 
    public ImageIcon acompanar() {
        return new ImageIcon("./factory_methods_java/images/dragonimg.jpg");
    }
}
