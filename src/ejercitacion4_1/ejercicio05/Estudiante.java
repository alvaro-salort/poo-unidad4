package ejercitacion4_1.ejercicio05;

public class Estudiante {
    private String legajo;
    private String nombre;

    /*
     * Excepcion NO verificada (unchecked): no hace falta declararla con throws,
     * pero si no se captura interrumpe el flujo del programa igual que las verificadas.
     */
    public Estudiante(String legajo, String nombre) {
        if (legajo == null || legajo.trim().isEmpty()) {
            throw new LegajoInvalidoException("El legajo no puede ser nulo ni vacio", legajo);
        }
        // formato universitario: la letra E seguida de uno o mas digitos
        if (!legajo.matches("^E\\d+$")) {
            throw new LegajoInvalidoException("El legajo debe tener el formato E seguido de numeros", legajo);
        }
        this.legajo = legajo;
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        // caso valido
        try {
            Estudiante estudiante = new Estudiante("E45012", "Sofia Herrera");
            System.out.printf("Estudiante %s inscripto con el legajo %s%n", estudiante.getNombre(), estudiante.getLegajo());
        } catch (LegajoInvalidoException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }

        // caso invalido: el legajo no cumple el formato
        System.out.println("\n--- LEGAJO CON FORMATO INVALIDO ---");
        try {
            new Estudiante("A123", "Carlos Paz");
        } catch (LegajoInvalidoException e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("Legajo recibido: " + e.getLegajoRecibido());
        }

        // caso invalido: legajo vacio
        System.out.println("\n--- LEGAJO VACIO ---");
        try {
            new Estudiante("", "Rita Nunez");
        } catch (LegajoInvalidoException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }
    }
}
