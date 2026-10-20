package ejercitacion4_1.ejercicio07;

public class RequisitosTitulacionException extends Exception {
    private int creditosObtenidos;
    private int creditosRequeridos;

    public RequisitosTitulacionException(String mensaje, int creditosObtenidos, int creditosRequeridos) {
        super(mensaje);
        this.creditosObtenidos = creditosObtenidos;
        this.creditosRequeridos = creditosRequeridos;
    }

    public int getCreditosObtenidos() {
        return creditosObtenidos;
    }

    public int getCreditosRequeridos() {
        return creditosRequeridos;
    }
}
