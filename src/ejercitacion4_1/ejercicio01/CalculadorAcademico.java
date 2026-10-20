package ejercitacion4_1.ejercicio01;

public class CalculadorAcademico {

    // metodo estatico: si la cantidad de materias es cero se lanza una excepcion no verificada
    public static double calcularPromedio(double sumaNotas, int cantidadMaterias) {
        if (cantidadMaterias == 0) {
            throw new ArithmeticException("La cantidad de materias no puede ser cero para el calculo del promedio");
        }
        return sumaNotas / cantidadMaterias;
    }

    public static void main(String[] args) {
        // caso normal
        try {
            double promedio = CalculadorAcademico.calcularPromedio(42.0, 6);
            System.out.printf("Promedio calculado: %.2f%n", promedio);
        } catch (ArithmeticException e) {
            System.err.println("[ERROR] No se pudo calcular el promedio: " + e.getMessage());
        }

        // caso de error: la excepcion salta y el bloque try se interrumpe
        System.out.println("\n--- CASO CON CANTIDAD DE MATERIAS EN CERO ---");
        try {
            double promedio = CalculadorAcademico.calcularPromedio(42.0, 0);
            System.out.printf("Promedio calculado: %.2f%n", promedio);
        } catch (ArithmeticException e) {
            System.err.println("[ERROR] No se pudo calcular el promedio: " + e.getMessage());
        }

        System.out.println("\nEl programa sigue su curso normal luego del error.");
    }
}
