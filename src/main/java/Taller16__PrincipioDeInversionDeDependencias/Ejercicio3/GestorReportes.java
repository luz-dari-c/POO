package Taller16__PrincipioDeInversionDeDependencias.Ejercicio3;



public class GestorReportes {
    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void crearReporte(String contenido) {
        generadorReporte.generar(contenido);
    }
}
