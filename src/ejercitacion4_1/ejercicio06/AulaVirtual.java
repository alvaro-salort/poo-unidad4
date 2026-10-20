package ejercitacion4_1.ejercicio06;

public class AulaVirtual {
    private String materia;
    private boolean enSesion;

    public AulaVirtual(String materia) {
        this.materia = materia;
        this.enSesion = false;
    }

    public void iniciarSesion() {
        this.enSesion = true;
        System.out.println("Se inicio la sesion virtual de " + this.materia + ".");
    }

    public void cerrarSesion() {
        this.enSesion = false;
        System.out.println("Se cerro la sesion virtual de " + this.materia + ".");
    }

    // transicion de estado invalida: el aula todavia no esta activa
    public void tomarAsistencia() throws EstadoAulaInvalidoException {
        if (!this.enSesion) {
            throw new EstadoAulaInvalidoException(
                    "No es posible tomar asistencia en un aula que no esta activa: " + this.materia);
        }
        System.out.println("Asistencia registrada para el aula de " + this.materia + ".");
    }

    public boolean isEnSesion() {
        return enSesion;
    }

    public static void main(String[] args) {
        AulaVirtual aula = new AulaVirtual("Fisica II");

        // intento de tomar asistencia antes de iniciar la sesion
        System.out.println("--- TOMA DE ASISTENCIA SIN SESION INICIADA ---");
        try {
            aula.tomarAsistencia();
        } catch (EstadoAulaInvalidoException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }

        // ahora la sesion esta activa y la operacion es valida
        System.out.println("\n--- TOMA DE ASISTENCIA CON SESION INICIADA ---");
        aula.iniciarSesion();
        try {
            aula.tomarAsistencia();
        } catch (EstadoAulaInvalidoException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }
    }
}
