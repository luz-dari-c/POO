package Taller7__ClasesAbstractas.Ejercicio1;


public class Circulo extends Figura {

    private double radio;

    public Circulo (double radio){
        this.radio = radio;
    }

    @Override
    double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }


}
