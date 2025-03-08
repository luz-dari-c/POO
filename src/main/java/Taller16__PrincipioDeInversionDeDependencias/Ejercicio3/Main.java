package Taller16__PrincipioDeInversionDeDependencias.Ejercicio3;


public class Main {
    public static void main(String[] args) {
        GestorReportes gestor1 = new GestorReportes(new ReportePDF());
        gestor1.crearReporte("Ventas de automoviles");

        GestorReportes gestor2 = new GestorReportes(new ReporteExcel());
        gestor2.crearReporte("Inventario de automoviles");
    }
}
