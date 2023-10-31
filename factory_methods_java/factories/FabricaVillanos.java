/**
 * Esta clase implementa la interfaz PersonajeFactory y define
 * las creaciones específicas para el tipo de personaje "Villano".
 */
public class FabricaVillanos implements PersonajeFactory {

    /**
     * Crea y retorna una nueva instancia de Villano.
     * 
     * @return un nuevo objeto Villano
     */
    public Personaje crearPersonaje() {
        return new Villano();
    }

    /**
     * Crea y retorna una nueva instancia de Daga, la cual es el arma
     * específica para el personaje tipo Villano.
     * 
     * @return un nuevo objeto Daga
     */
    public Arma crearArma() {
        return new Daga();
    }

    /**
     * Crea y retorna una nueva instancia de Serpiente, la cual es la
     * mascota específica para el personaje tipo Villano.
     * 
     * @return un nuevo objeto Serpiente
     */
    public Mascota crearMascota() {
        return new Serpiente();
    }

}
