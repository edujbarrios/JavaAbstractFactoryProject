/**
 * Interfaz Arma que define el comportamiento que todas las armas deben tener.
 * Cualquier tipo específico de arma que se cree debe implementar este contrato.
 */
public interface Arma {

    /**
     * Método que simula el uso del arma. Las clases concretas que implementen
     * esta interfaz proporcionarán una implementación específica de cómo se usa 
     * el arma en cuestión.
     */
    void usar();

}
