package Taller7__ClasesAbstractas.Ejercicio3;


class Vendedor extends Empleado {
    private double pagoPorDia;
    private int diasTrabajados;

    public Vendedor(double pagoPorDia, int diasTrabajados) {
        this.pagoPorDia = pagoPorDia;
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    double calcularSalario() {
        return pagoPorDia * diasTrabajados;
    }
}