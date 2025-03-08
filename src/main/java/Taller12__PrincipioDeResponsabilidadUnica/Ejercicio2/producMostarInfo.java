package Taller12__PrincipioDeResponsabilidadUnica.Ejercicio2;


public class producMostarInfo{

    public void mostrarInformacion(Producto producto) {
        System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Código: " + producto.getCodigo());
    }
}
