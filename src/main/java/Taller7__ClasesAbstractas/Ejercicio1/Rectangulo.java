package Taller7__ClasesAbstractas.Ejercicio1;


public class Rectangulo extends Figura{

    private double base;
    private double altura;

    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea(){
        return (base * altura)/2;
    }

}
