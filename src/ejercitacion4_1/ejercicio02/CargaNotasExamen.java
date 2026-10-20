package ejercitacion4_1.ejercicio02;

public class CargaNotasExamen {
    // posicion siguiente a cargar dentro del acta
    private int posicionActual;

    public void procesarCalificacion(String entradaNota, double[] acta) {
        double nota = Double.parseDouble(entradaNota);
        acta[posicionActual] = nota;
        posicionActual++;
        System.out.printf("Nota %.2f cargada en la posicion %d del acta.%n", nota, posicionActual - 1);
    }

    public static void main(String[] args) {
        CargaNotasExamen cargador = new CargaNotasExamen();
        double[] acta = new double[3];

        // 1. carga valida
        System.out.println("--- CARGA DE NOTAS VALIDA ---");
        try {
            cargador.procesarCalificacion("8.5", acta);
            cargador.procesarCalificacion("6.0", acta);
        } catch (NumberFormatException e) {
            System.err.println("[ERROR] La nota no es un numero valido: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("[ERROR] No hay lugar en el acta para esa nota: " + e.getMessage());
        } finally {
            System.out.println("Proceso de auditoría de nota finalizado");
        }

        // 2. la cadena no es numerica -> NumberFormatException
        System.out.println("\n--- NOTA NO NUMERICA ---");
        try {
            cargador.procesarCalificacion("ocho", acta);
        } catch (NumberFormatException e) {
            System.err.println("[ERROR] La nota no es un numero valido: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("[ERROR] No hay lugar en el acta para esa nota: " + e.getMessage());
        } finally {
            System.out.println("Proceso de auditoría de nota finalizado");
        }

        // 3. el acta ya esta completa -> ArrayIndexOutOfBoundsException
        System.out.println("\n--- ACTA COMPLETADA ---");
        try {
            cargador.procesarCalificacion("9.0", acta);
            cargador.procesarCalificacion("10.0", acta);
        } catch (NumberFormatException e) {
            System.err.println("[ERROR] La nota no es un numero valido: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("[ERROR] No hay lugar en el acta para esa nota: " + e.getMessage());
        } finally {
            System.out.println("Proceso de auditoría de nota finalizado");
        }
    }
}
