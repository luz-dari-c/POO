package Taller8__HerenciaSimple.Ejercicio1;



public class Coche extends Vehiculo{
    private int numeroDePuertas;

    public Coche(int numeroDePuertas, String marca, int velocidadMaxima){
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Marca: " + marca + "\nVelocidad Maxima: " + velocidadMaxima + "km/h" + "Numero de puertas: " + numeroDePuertas);
    }


}
