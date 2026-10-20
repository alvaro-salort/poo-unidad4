package ejercitacion4_1.ejercicio03;

public class Evaluacion {
    private String materia;
    private double nota;

    public Evaluacion(String materia) {
        this.materia = materia;
        this.nota = 0.0;
    }

    // la firma declara la excepcion: el compilador OBLIGA a manejarla
    public void asignarNota(double nota) throws NotaInvalidaException {
        if (nota < 0.0 || nota > 10.0) {
            throw new NotaInvalidaException("La nota debe estar entre 0.0 y 10.0", nota);
        }
        this.nota = nota;
    }

    public String getMateria() {
        return materia;
    }

    public double getNota() {
        return nota;
    }

    public static void main(String[] args) {
        Evaluacion evaluacion = new Evaluacion("Analisis Matematico");

        // caso valido
        try {
            evaluacion.asignarNota(8.75);
            System.out.printf("Nota asignada en %s: %.2f%n", evaluacion.getMateria(), evaluacion.getNota());
        } catch (NotaInvalidaException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }

        // caso invalido: nota 11.5 fuera del rango [0.0, 10.0]
        System.out.println("\n--- NOTA FUERA DE RANGO ---");
        try {
            evaluacion.asignarNota(11.5);
        } catch (NotaInvalidaException e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("Nota recibido: " + e.getNotaRecibida());
        }
    }
}
