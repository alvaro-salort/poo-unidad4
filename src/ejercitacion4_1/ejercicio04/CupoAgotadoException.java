package ejercitacion4_1.ejercicio04;

public class CupoAgotadoException extends Exception {
    private int capacidadMaxima;

    public CupoAgotadoException(String mensaje, int capacidadMaxima) {
        super(mensaje);
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
}
