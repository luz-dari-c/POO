package Taller12__PrincipioDeResponsabilidadUnica.Ejercicio1;



public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro();

        LibroReporte libroReporte = new LibroReporte();
        VentaLibro ventaLibro = new VentaLibro();

        libroReporte.generarReporte(libro);
        ventaLibro.ventaFactura(libro, 200000);
    }
}
