package interfaces;

/**
 * Interfaz interfaces.PersonajeFactory que define los métodos necesarios para crear
 * distintos componentes de un personaje: el personaje mismo, su arma y su mascota.
 */
public interface PersonajeFactory {

    /**
     * Método para crear un nuevo personaje. Las clases que implementen esta 
     * interfaz definirán qué tipo específico de personaje se crea.
     * 
     * @return una nueva instancia de un interfaces.Personaje
     */
    Personaje crearPersonaje();

    /**
     * Método para crear un arma asociada al personaje. Las clases que implementen 
     * esta interfaz definirán qué tipo específico de arma se crea.
     * 
     * @return una nueva instancia de una interfaces.Arma
     */
    Arma crearArma();

    /**
     * Método para crear una mascota asociada al personaje. Las clases que implementen
     * esta interfaz definirán qué tipo específico de mascota se crea.
     * 
     * @return una nueva instancia de una interfaces.Mascota
     */
    Mascota crearMascota();

}
