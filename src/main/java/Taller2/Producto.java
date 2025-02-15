package Taller2;


public class Producto {

    public String nombre ;
    public  int precio;

    public Producto (String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto(){
        System.out.println("Producto\nNombre: " + nombre + "\nPrecio: " + precio);
    }

}
