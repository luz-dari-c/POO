package Taller7__ClasesAbstractas.Ejercicio2;


public class Vendedor extends Empleado{
    private int diasTrabajados;
    private double pagoPorDia;

    public Vendedor (int diasTrabajados, double pagoPorDia){
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }

    @Override
    double calcularSalario(){
        return diasTrabajados * pagoPorDia;
    }

}
