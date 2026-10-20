package ejercitacion4_1.ejercicio03;

public class NotaInvalidaException extends Exception {
    private double notaRecibida;

    public NotaInvalidaException(String mensaje, double notaRecibida) {
        super(mensaje);
        this.notaRecibida = notaRecibida;
    }

    public double getNotaRecibida() {
        return notaRecibida;
    }
}
