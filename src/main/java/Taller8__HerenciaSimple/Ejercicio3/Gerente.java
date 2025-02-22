package Taller8__HerenciaSimple.Ejercicio3;


public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + "\nSalario: " + salario + "Departamento: " + departamento);
    }
}
