package Taller4__ModificadorDeAccesoPublic.Ejercicio1;


public class ClaseDePrueba {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Alex", 1500000);

        System.out.println("Nombre: "+ empleado.nombre);
        System.out.println("Salario: " + empleado.getSalario());



    }
}
