package Taller15__PrincipioDeSegregacionDeInterfaces.Ejercicio2;


public class Pagos implements PagoFactura {
    @Override
    public void pagarFactura(double monto) {
        System.out.println("Pago de factura de $" + monto + " realizado.");
    }
}