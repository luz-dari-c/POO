package Taller5__ModificadorDeAccesoProtected.Ejercicio3;


public class Banco_seguro {

    private double saldo; // Se mantiene privado para evitar accesos directos

    public Banco_seguro(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("El saldo inicial no puede ser negativo.");
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso\n" + "Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso");
            System.out.println("Nuevo saldo: " + saldo);
            return true;
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
            return false;
        }
    }
}
