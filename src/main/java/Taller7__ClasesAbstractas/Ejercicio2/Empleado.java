package Taller7__ClasesAbstractas.Ejercicio2;


abstract class Empleado {

   abstract double calcularSalario();

   public void mostrarSalario(){
       System.out.println("El salario es: " + calcularSalario());
   }
}
