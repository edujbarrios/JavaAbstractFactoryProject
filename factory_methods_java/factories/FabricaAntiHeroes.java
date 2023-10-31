public class FabricaAntiHeroes implements PersonajeFactory { 
    public Personaje crearPersonaje() { return new AntiHeroe(); } 
    public Arma crearArma() { return new Ballesta(); } 
    public Mascota crearMascota() { return new Grifo(); } 
}
