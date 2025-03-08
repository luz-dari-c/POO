package Taller12__PrincipioDeResponsabilidadUnica.Ejercicio2;



public class Main {
    public static void main(String[] args) {

            Producto producto = new Producto("Microfono", 100000.0, "HYIMM");
            ProductoEtiqueta etiqueta = new ProductoEtiqueta();
            ProductoPrecio precio = new ProductoPrecio();

            producMostarInfo info = new producMostarInfo();


            info.mostrarInformacion(producto);
            etiqueta.generarEtiqueta(producto);
            System.out.println("Precio con IVA: " + precio.calcularPrecioConImpuesto(producto, 0.15));
        }

}
