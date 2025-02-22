package Taller7__ClasesAbstractas.Ejercicio3;


class Gerente extends Empleado {
    private double pagoPorDia;
    private int diasTrabajados;

    public Gerente( double pagoPorDia, int diasTrabajados) {
        this.pagoPorDia = pagoPorDia;
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    double calcularSalario() {
        return pagoPorDia * diasTrabajados;
    }
}