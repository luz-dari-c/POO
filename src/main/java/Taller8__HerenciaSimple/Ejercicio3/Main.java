package Taller8__HerenciaSimple.Ejercicio3;



public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Luz", 3000000);
        Gerente gerente = new Gerente("Sydierg", 5000000, "Ventas");

        System.out.println("Empleado");
        empleado.mostrarDetalles();

        System.out.println("_____________________________");

        System.out.println("Gerente");
        gerente.mostrarDetalles();
    }
}
