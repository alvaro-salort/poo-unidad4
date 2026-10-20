package ejercitacion4_1.ejercicio10;

public class Estudiante {
    private String legajo;
    private String nombre;
    private boolean documentacionCompleta;

    public Estudiante(String legajo, String nombre, boolean documentacionCompleta) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.documentacionCompleta = documentacionCompleta;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDocumentacionCompleta() {
        return documentacionCompleta;
    }
}
