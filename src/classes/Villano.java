package classes;

import interfaces.Personaje;

import javax.swing.*;

/**
 * La clase clases.Villano representa un villano en un juego o simulación.
 * Implementa la interfaz interfaces.Personaje, esta clase
 * va a implementar todos los métodos definidos en esa interfaz "Personajes".
 * En este caso concreto los personajes solo pueden atacar. 
 */
public class Villano implements Personaje {

    /**
     * Representa el nivel de maldad del villano.
     */
    private int nivelDeMaldad;

    /**
     * Método que representa la acción de atacar por parte del villano.
     */
    public ImageIcon atacar() {
        /**
        * Añadiendo imagen
        */
        return new ImageIcon("./factory_methods_java/images/villanoimg.jpg");
    }
}
