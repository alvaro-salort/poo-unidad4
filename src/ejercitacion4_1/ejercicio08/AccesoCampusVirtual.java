package ejercitacion4_1.ejercicio08;

import java.io.IOException;

public class AccesoCampusVirtual {

    // excepcion de alto nivel: envuelve la falla tecnica de bajo nivel
    public void iniciarSesion(String usuario, String clave) throws AutenticacionCampusException {
        try {
            conectarConServidorCampus(usuario, clave);
            System.out.println("Sesion iniciada para el usuario " + usuario + ".");
        } catch (IOException ioException) {
            // exception wrapping: se conserva la causa raiz
            throw new AutenticacionCampusException("Error al ingresar al campus", ioException);
        }
    }

    // falla tecnica simulada de bajo nivel
    private void conectarConServidorCampus(String usuario, String clave) throws IOException {
        if (usuario == null || clave == null || clave.isEmpty()) {
            throw new IOException("No se pudo establecer conexion con el servidor del campus");
        }
    }

    public static void main(String[] args) {
        AccesoCampusVirtual acceso = new AccesoCampusVirtual();

        // caso valido
        System.out.println("--- INGRESO CORRECTO ---");
        try {
            acceso.iniciarSesion("alvaro", "claveSegura");
        } catch (AutenticacionCampusException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }

        // caso de falla tecnica: se muestra la causa raiz
        System.out.println("\n--- INGRESO CON FALLA TECNICA ---");
        try {
            acceso.iniciarSesion("alvaro", "");
        } catch (AutenticacionCampusException e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("Causa raiz: " + e.getCause().getClass().getSimpleName()
                    + " -> " + e.getCause().getMessage());
        }
    }
}
