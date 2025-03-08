package Taller16__PrincipioDeInversionDeDependencias.Ejercicio3;



public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String contenido) {
        System.out.println("Generando reporte Excel con contenido: " + contenido);
    }
}
