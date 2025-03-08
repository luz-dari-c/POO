package Taller13__OpenClosedPrinciple.Ejercicio1;


public class descuentoFijo extends Descuento {
    private double cantidad;

    public descuentoFijo(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double descuento(double precio) {
        return Math.max(precio - cantidad, 0);
    }
}
