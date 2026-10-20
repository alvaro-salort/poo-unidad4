package ejercitacion4_1.ejercicio08;

public class AutenticacionCampusException extends Exception {

    // super(mensaje, causa) guarda la excepcion original como causa raiz
    public AutenticacionCampusException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
