package Taller14__PrincipioDeSustitucionLiskov.Ejercicio3;


public class Bicicleta  extends Transporte{

    @Override
    public void moverse(){
        System.out.println("La bicicleta esta en movimiento en la avenida");
    }
}
