package Taller12__PrincipioDeResponsabilidadUnica.Ejercicio1;



public class VentaLibro {

    public void ventaFactura(Libro libro, int precio){

        int p = libro.getPrecio();
        if (p == precio){
            System.out.println("Libro " + libro.getTitulo() + " Comprado exitosamente");
        } else if (p < precio) {
            System.out.println("Su dinero en insuficiente");
        } else if (p > precio){
            System.out.println("Ingrese la cantidad exacta, por favor");
        }

    }
}
