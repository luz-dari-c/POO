package Taller7__ClasesAbstractas.Ejercicio2;


public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente(30, 100000);
        Vendedor vendedor = new Vendedor(30, 50000);

        System.out.println("Gerente ");
        gerente.mostrarSalario();

        System.out.println("Vendedor ");
        vendedor.mostrarSalario();
    }
}
