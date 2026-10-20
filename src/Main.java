import java.util.Scanner;

import ejercitacion4_1.ejercicio01.CalculadorAcademico;
import ejercitacion4_1.ejercicio02.CargaNotasExamen;
import ejercitacion4_1.ejercicio03.Evaluacion;
import ejercitacion4_1.ejercicio04.Comision;
import ejercitacion4_1.ejercicio05.Estudiante;
import ejercitacion4_1.ejercicio06.AulaVirtual;
import ejercitacion4_1.ejercicio07.VerificadorTitulacion;
import ejercitacion4_1.ejercicio08.AccesoCampusVirtual;
import ejercitacion4_1.ejercicio09.RegistroUniversidad;
import ejercitacion4_1.ejercicio10.ProcesadorMatricula;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;
        do {
            System.out.println("\n==================================================");
            System.out.println("       MENÚ PRINCIPAL - EJERCITACIONES POO        ");
            System.out.println("==================================================");
            System.out.println("1. Ejercitación 4.E.1 (Ejercicios 1 a 10)");
            System.out.println("0. Salir");
            System.out.println("==================================================");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    menuEjercitacion4_1();
                    break;
                case 0:
                    System.out.println("\n¡Gracias por revisar las ejercitaciones!");
                    break;
                default:
                    System.out.println("\n[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static void menuEjercitacion4_1() {
        int opcion = -1;
        do {
            System.out.println("\n--------------------------------------------------");
            System.out.println("              EJERCITACIÓN 4.E.1                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("1.  Ejercicio 1: CalculadorAcademico");
            System.out.println("2.  Ejercicio 2: CargaNotasExamen");
            System.out.println("3.  Ejercicio 3: Evaluacion y NotaInvalidaException");
            System.out.println("4.  Ejercicio 4: Comision y CupoAgotadoException");
            System.out.println("5.  Ejercicio 5: Estudiante y LegajoInvalidoException");
            System.out.println("6.  Ejercicio 6: AulaVirtual y EstadoAulaInvalidoException");
            System.out.println("7.  Ejercicio 7: SistemaTitulacion");
            System.out.println("8.  Ejercicio 8: AccesoCampusVirtual");
            System.out.println("9.  Ejercicio 9: RegistroUniversidad");
            System.out.println("10. Ejercicio 10: ProcesadorMatricula");
            System.out.println("0.  Volver al menú principal");
            System.out.println("--------------------------------------------------");
            System.out.print("Seleccione un ejercicio a ejecutar: ");

            opcion = leerEntero();
            System.out.println();

            switch (opcion) {
                case 1:
                    CalculadorAcademico.main(new String[0]);
                    pausa();
                    break;
                case 2:
                    CargaNotasExamen.main(new String[0]);
                    pausa();
                    break;
                case 3:
                    Evaluacion.main(new String[0]);
                    pausa();
                    break;
                case 4:
                    Comision.main(new String[0]);
                    pausa();
                    break;
                case 5:
                    Estudiante.main(new String[0]);
                    pausa();
                    break;
                case 6:
                    AulaVirtual.main(new String[0]);
                    pausa();
                    break;
                case 7:
                    VerificadorTitulacion.main(new String[0]);
                    pausa();
                    break;
                case 8:
                    AccesoCampusVirtual.main(new String[0]);
                    pausa();
                    break;
                case 9:
                    RegistroUniversidad.main(new String[0]);
                    pausa();
                    break;
                case 10:
                    ProcesadorMatricula.main(new String[0]);
                    pausa();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("[!] Opción inválida.");
            }
        } while (opcion != 0);
    }

    private static int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (Exception e) {
            return -1;
        }
    }

    private static void pausa() {
        System.out.println("\nPresione ENTER para continuar...");
        scanner.nextLine();
    }
}
// Hecho con ayuda de la buena IA
