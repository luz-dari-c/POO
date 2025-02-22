package Taller10__InterfacesVsClasesAbstractas.Ejercicio1;


public class Triangulo extends Figura {
    private double altura;
    private  double base;

    public Triangulo(double altura, double base){
        this.altura=altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (altura * base)/2;
    }
}
