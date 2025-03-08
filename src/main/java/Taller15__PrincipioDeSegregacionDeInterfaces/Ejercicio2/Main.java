package Taller15__PrincipioDeSegregacionDeInterfaces.Ejercicio2;


public class Main {
    public static void main(String[] args) {
        Transferencia cuenta = new CuentaBancaria();
        Retiro retiro = new CuentaBancaria();
        PagoFactura pagos = new Pagos();

        cuenta.transferir(1250000);
        retiro.retirar(500000);
        pagos.pagarFactura(23000);
    }
}
