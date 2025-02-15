package Taller4__ModificadorDeAccesoPublic.Ejercicio2;


public class ClaseDePrueba {
    public static void main(String[] args) {
        cuentaBancaria cuentaBancaria = new cuentaBancaria(101022, 30000000, "Corriente");

       // cuentaBancaria.numeroCuenta; -------> No se puede acceder directamente

        cuentaBancaria.mostrarDetalles();

    }
}
