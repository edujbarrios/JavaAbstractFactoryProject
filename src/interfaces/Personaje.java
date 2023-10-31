package interfaces;

/**
 * Interfaz interfaces.Personaje que define el comportamiento que todos los personajes deben tener.
 * Cualquier tipo específico de personaje que se cree debe implementar este contrato.
 */
public interface Personaje {

    /**
     * Método que simula la acción de un personaje atacando.
     */
    void atacar();
}
