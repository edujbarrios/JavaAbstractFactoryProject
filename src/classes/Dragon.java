package classes;

import interfaces.Mascota;

import javax.swing.*;

public class Dragon implements Mascota {
    private String colorDeFuego; 
    public ImageIcon acompanar() {
        return new ImageIcon("./images/dragonimg.jpg");
    }
}
