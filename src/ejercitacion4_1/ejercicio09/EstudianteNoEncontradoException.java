package ejercitacion4_1.ejercicio09;

public class EstudianteNoEncontradoException extends Exception {
    private String legajoBuscado;

    public EstudianteNoEncontradoException(String mensaje, String legajoBuscado) {
        super(mensaje);
        this.legajoBuscado = legajoBuscado;
    }

    public String getLegajoBuscado() {
        return legajoBuscado;
    }
}
