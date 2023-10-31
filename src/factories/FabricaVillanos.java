package factories;

import classes.*;
import interfaces.*;

/**
 * Esta clase implementa la interfaz interfaces.PersonajeFactory y define
 * las creaciones específicas para el tipo de personaje "clases.Villano".
 */
public class FabricaVillanos implements PersonajeFactory {

    /**
     * Crea y retorna una nueva instancia de clases.Villano.
     * 
     * @return un nuevo objeto clases.Villano
     */
    public Personaje crearPersonaje() {
        return new Villano();
    }

    /**
     * Crea y retorna una nueva instancia de clases.Daga, la cual es el arma
     * específica para el personaje tipo clases.Villano.
     * 
     * @return un nuevo objeto clases.Daga
     */
    public Arma crearArma() {
        return new Daga();
    }

    /**
     * Crea y retorna una nueva instancia de clases.Serpiente, la cual es la
     * mascota específica para el personaje tipo clases.Villano.
     * 
     * @return un nuevo objeto clases.Serpiente
     */
    public Mascota crearMascota() {
        return new Serpiente();
    }

}
