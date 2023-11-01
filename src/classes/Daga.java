package classes;

import interfaces.Arma;

import javax.swing.*;

/**
 * La clase clases.Daga representa una daga que sirve como arma para el villano.
 * Implementa la interfaz interfaces.Arma,
 **/
public class Daga implements Arma {

    /**
     * Representa la longitud de la daga.
     * Caracteriza la daga en términos de tamaño
     * serviría también para determinar ciertas características en combate.
     */
    private double longitud;

    /**
     * Método que representa la acción de usar la daga.
     */
    public ImageIcon usar() {
        /**
        * Añadiendo imagen de daga
        */
        return new ImageIcon("./factory_methods_java/images/dagaimg.jpg");
    }
}
