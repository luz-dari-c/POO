package Taller8__UsoDeSuper.Ejercicio1;



public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Han", 59);
        Empleado empleado = new Empleado("Mery", 43, "Recursos Humanos");

        System.out.println("Persona");
        persona.mostrarDetalles();
        System.out.println("____________________________________");
        System.out.println("Empleado");
        empleado.mostrarDetalles();

    }
}
