package ejercitacion4_1.ejercicio09;

import java.util.ArrayList;

public class RegistroUniversidad {
    private ArrayList<Estudiante> estudiantes;

    public RegistroUniversidad() {
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        this.estudiantes.add(e);
    }

    // si la busqueda termina sin coincidencia se lanza la excepcion verificada
    public Estudiante buscarPorLegajo(String legajo) throws EstudianteNoEncontradoException {
        for (Estudiante estudiante : this.estudiantes) {
            if (estudiante.getLegajo().equalsIgnoreCase(legajo)) {
                return estudiante;
            }
        }
        throw new EstudianteNoEncontradoException("No se encontro ningun estudiante con el legajo " + legajo, legajo);
    }

    public static void main(String[] args) {
        RegistroUniversidad registro = new RegistroUniversidad();
        registro.agregarEstudiante(new Estudiante("E101", "Ana Lopez"));
        registro.agregarEstudiante(new Estudiante("E102", "Bruno Diaz"));
        registro.agregarEstudiante(new Estudiante("E103", "Carla Sosa"));

        // busqueda exitosa
        System.out.println("--- BUSQUEDA EXITOSA ---");
        try {
            Estudiante encontrado = registro.buscarPorLegajo("E102");
            System.out.println("Estudiante encontrado: " + encontrado);
        } catch (EstudianteNoEncontradoException e) {
            System.err.println("[ERROR] " + e.getMessage());
        }

        // busqueda fallida
        System.out.println("\n--- BUSQUEDA SIN RESULTADOS ---");
        try {
            Estudiante encontrado = registro.buscarPorLegajo("E999");
            System.out.println("Estudiante encontrado: " + encontrado);
        } catch (EstudianteNoEncontradoException e) {
            System.err.println("[ERROR] " + e.getMessage());
            System.err.println("Legajo buscado: " + e.getLegajoBuscado());
        }
    }
}
