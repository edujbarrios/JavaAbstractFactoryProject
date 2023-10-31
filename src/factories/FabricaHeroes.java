package factories;

import classes.*;
import interfaces.*;

public class FabricaHeroes implements PersonajeFactory {
    public Personaje crearPersonaje() { return new Heroe(); }
    public Arma crearArma() { return new Espada(); }
    public Mascota crearMascota() { return new Dragon(); }
}
