package ejercitacion4_1.ejercicio04;

public class Comision {
    private String nombre;
    private int capacidadMaxima;
    private int alumnosInscriptos;

    public Comision(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.alumnosInscriptos = 0;
    }

    // capa interna: valida y lanza, pero NO captura la excepcion
    private void verificarDisponibilidad() throws CupoAgotadoException {
        if (this.alumnosInscriptos >= this.capacidadMaxima) {
            throw new CupoAgotadoException("No hay lugares disponibles en la comision " + this.nombre,
                    this.capacidadMaxima);
        }
    }

    // capa intermedia: propaga la excepcion hacia la capa cliente
    public void inscribirEstudiante(String nombreAlumno) throws CupoAgotadoException {
        verificarDisponibilidad();
        this.alumnosInscriptos++;
        System.out.printf("Alumno %s inscripto en la comision %s (%d/%d).%n",
                nombreAlumno, this.nombre, this.alumnosInscriptos, this.capacidadMaxima);
    }

    public int getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public static void main(String[] args) {
        Comision comision = new Comision("Programacion II", 2);

        // dos inscripciones correctas
        try {
            comision.inscribirEstudiante("Ana Lopez");
            comision.inscribirEstudiante("Juan Perez");
        } catch (CupoAgotadoException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }

        // la tercera inscripcion falla en la capa interna y sube por la pila de llamadas
        System.out.println("\n--- INSCRIPCION SIN CUPOS ---");
        try {
            comision.inscribirEstudiante("Marta Diaz");
        } catch (CupoAgotadoException e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("Capacidad maxima de la comision: " + e.getCapacidadMaxima());
        }
    }
}
