package Taller14__PrincipioDeSustitucionLiskov.Ejercicio2;


public class Main {
    public static void main(String[] args) {
        cuentaBancaria cuenta = new cuentaAhorro(100000, 0.02);

        cuenta.depositar(250000);
        cuenta.retirar(12000);

        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
