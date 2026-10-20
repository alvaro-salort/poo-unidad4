package ejercitacion4_1.ejercicio07;

public class VerificadorTitulacion {
    private static final int CREDITOS_REQUERIDOS = 120;

    // capa de dominio: valida y lanza la excepcion
    public void validarCreditos(int creditosObtenidos) throws RequisitosTitulacionException {
        if (creditosObtenidos < CREDITOS_REQUERIDOS) {
            throw new RequisitosTitulacionException(
                    "No se puede emitir el titulo: faltan creditos para la titulacion",
                    creditosObtenidos, CREDITOS_REQUERIDOS);
        }
        System.out.printf("Titulo habilitado con %d creditos.%n", creditosObtenidos);
    }

    public static void main(String[] args) {
        GestorTitulacion gestor = new GestorTitulacion();

        // caso valido
        System.out.println("--- SOLICITUD CON CREDITOS SUFICIENTES ---");
        try {
            gestor.procesarTitulo(180);
        } catch (RequisitosTitulacionException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }

        // caso invalido: la excepcion es re-lanzada por la capa intermedia
        System.out.println("\n--- SOLICITUD CON CREDITOS INSUFICIENTES ---");
        try {
            gestor.procesarTitulo(90);
        } catch (RequisitosTitulacionException e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("Creditos obtenidos: " + e.getCreditosObtenidos()
                    + " | Creditos requeridos: " + e.getCreditosRequeridos());
        }
    }
}
