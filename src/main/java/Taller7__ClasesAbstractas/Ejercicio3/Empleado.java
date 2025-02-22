package Taller7__ClasesAbstractas.Ejercicio3;


abstract class Empleado {


    public void mostrarDetalles() {
        System.out.println("Salario: " + calcularSalario());
    }

    abstract double calcularSalario();
}