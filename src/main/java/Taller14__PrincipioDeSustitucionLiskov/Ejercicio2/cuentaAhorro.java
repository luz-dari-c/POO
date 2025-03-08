package Taller14__PrincipioDeSustitucionLiskov.Ejercicio2;



public class cuentaAhorro extends cuentaBancaria {


    private double tasaInteres;

    public cuentaAhorro(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes en la cuenta de ahorros.");
        }
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}
