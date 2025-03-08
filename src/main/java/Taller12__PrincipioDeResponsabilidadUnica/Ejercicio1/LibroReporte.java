package Taller12__PrincipioDeResponsabilidadUnica.Ejercicio1;


public class LibroReporte {

        public void generarReporte(Libro libro) {
            System.out.println("Generando reporte del libro: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("ISMB: " + libro.getIsbn());
            System.out.println("Precio: " + libro.getPrecio());
        }

}
