package Taller5__ModificadorDeAccesoProtected.Ejercicio3;


public class Main {
    public static void main(String[] args) {

        Banco_seguro bancoSeguro = new Banco_seguro(10000);


        System.out.println("Saldo actual: " + bancoSeguro.getSaldo());

        bancoSeguro.depositar(15000);
        bancoSeguro.retirar(3000);

    }
}
