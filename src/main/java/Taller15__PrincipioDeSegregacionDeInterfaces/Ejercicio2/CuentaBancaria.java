package Taller15__PrincipioDeSegregacionDeInterfaces.Ejercicio2;

/****************************************************
 Developer Name: Luz Dari Crespo Gómez
 Developer Contact: luzdaricrespo@gmail.com
 ****************************************************/


public class CuentaBancaria implements Transferencia, Retiro {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia de $" + monto + " realizada.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado.");
    }
}
