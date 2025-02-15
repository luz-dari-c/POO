package Taller3.Ejercicio1;



class Producto {

    String nombre;
    int precio;
    int stock;

    Producto(String nombre, int precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo(){

        System.out.println("Detalles del producto\nNombre: " + nombre + "\nPrecio: " + precio + "\nStock: " + stock );
    }



}
