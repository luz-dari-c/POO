package Taller7__ClasesAbstractas.Ejercicio2;


public class Gerente extends Empleado{
    private int diasTrabajados;
    private double pagoPorDia;

    public Gerente(int diasTrabajados, double pagoPorDia){
        this.pagoPorDia = pagoPorDia;
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    double calcularSalario(){
        return diasTrabajados * pagoPorDia;
    }
}
