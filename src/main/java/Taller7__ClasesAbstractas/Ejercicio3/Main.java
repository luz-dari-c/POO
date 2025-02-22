package Taller7__ClasesAbstractas.Ejercicio3;


public class Main {
    public static void main(String[] args) {
        // Intentamos instanciar una clase abstracta (provocará error de compilación)
        // Empleado empleado = new Empleado("Luz");

        Empleado gerente = new Gerente(90000, 30);
        Empleado vendedor = new Vendedor( 50000, 27);

        System.out.println("Gerente");
        gerente.mostrarDetalles();
        System.out.println("Vendedor");
        vendedor.mostrarDetalles();

    }
}
