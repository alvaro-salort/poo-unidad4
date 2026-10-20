package ejercitacion4_1.ejercicio07;

public class GestorTitulacion {
    private VerificadorTitulacion verificador;

    public GestorTitulacion() {
        this.verificador = new VerificadorTitulacion();
    }

    // re-throw: se registra la auditoria y la misma excepcion sigue hacia arriba
    public void procesarTitulo(int creditosObtenidos) throws RequisitosTitulacionException {
        try {
            this.verificador.validarCreditos(creditosObtenidos);
        } catch (RequisitosTitulacionException e) {
            System.out.println("[AUDITORIA] Solicitud de titulacion rechazada con " + e.getCreditosObtenidos()
                    + " creditos.");
            throw e;
        }
    }
}
