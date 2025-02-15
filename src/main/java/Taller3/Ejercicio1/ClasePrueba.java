package Taller3.Ejercicio1;


public class ClasePrueba {
    public static void main(String[] args) {

        Producto producto = new Producto("Televisor", 1200000, 45);


        System.out.println("Nombre: " + producto.nombre);
        System.out.println("Precio: " +producto.precio);
        System.out.println("Stock: " + producto.stock);

        System.out.println("-------------------------------");

        producto.mostrarInfo();

    }
}
