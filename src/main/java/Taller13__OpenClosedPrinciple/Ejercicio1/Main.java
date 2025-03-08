package Taller13__OpenClosedPrinciple.Ejercicio1;



public class Main {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new descuentoPorcentaje(10);
        Descuento descuentoFijo = new descuentoFijo(70);

        double precioOriginal = 200;
        System.out.println("Precio con descuento porcentual: " + descuentoPorcentaje.descuento(precioOriginal));
        System.out.println("Precio con descuento fijo: " + descuentoFijo.descuento(precioOriginal));
    }
}
