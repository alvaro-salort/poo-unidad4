package ejercitacion4_1.ejercicio10;

public class ProcesadorMatricula {

    /*
     *La documentacion incompleta lanza una excepcion NO verificada (se lanza de inmediato)
     * y el arancel al dia lanza una excepcion VERIFICADA (declarada con throws).
     */
    public boolean confirmarMatricula(Estudiante e, boolean pagoConfirmado, boolean arancelAlDia)
            throws PagoMatriculaPendienteException {

        if (!e.isDocumentacionCompleta()) {
            throw new DocumentacionIncompletaException(
                    "La documentacion del estudiante " + e.getLegajo() + " esta incompleta");
        }
        if (!arancelAlDia) {
            throw new PagoMatriculaPendienteException(
                    "El estudiante " + e.getLegajo() + " debe regularizar el arancel antes de matricularse");
        }
        return pagoConfirmado;
    }

    public static void main(String[] args) {
        ProcesadorMatricula procesador = new ProcesadorMatricula();

        Estudiante estudiante1 = new Estudiante("E201", "Ana Lopez", true);
        Estudiante estudiante2 = new Estudiante("E202", "Bruno Diaz", true);
        Estudiante estudiante3 = new Estudiante("E203", "Carla Sosa", false);

        System.out.println("--- LOTE DE MATRICULACIONES ---");
        try {
            // caso valido
            boolean confirmada = procesador.confirmarMatricula(estudiante1, true, true);
            System.out.printf("Matricula de %s confirmada: %s%n", estudiante1.getNombre(), confirmada);

            // caso con documentacion incompleta (excepcion no verificada)
            try {
                procesador.confirmarMatricula(estudiante3, true, true);
            } catch (DocumentacionIncompletaException e) {
                System.err.println("[ERROR] " + e.getMessage());
            }

            // caso con arancel pendiente (excepcion verificada)
            try {
                procesador.confirmarMatricula(estudiante2, false, false);
            } catch (PagoMatriculaPendienteException e) {
                System.err.println("[ERROR] " + e.getMessage());
            }
        } catch (PagoMatriculaPendienteException e) {
            System.err.println("[ERROR] " + e.getMessage());
        } finally {
            System.out.println("Registro de auditoría de matriculación cerrado");
        }
    }
}
