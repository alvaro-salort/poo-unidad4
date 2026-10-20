package ejercitacion4_1.ejercicio05;

public class LegajoInvalidoException extends RuntimeException {
    private String legajoRecibido;

    public LegajoInvalidoException(String mensaje, String legajoRecibido) {
        super(mensaje);
        this.legajoRecibido = legajoRecibido;
    }

    public String getLegajoRecibido() {
        return legajoRecibido;
    }
}
