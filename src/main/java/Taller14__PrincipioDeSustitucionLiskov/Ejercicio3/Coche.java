package Taller14__PrincipioDeSustitucionLiskov.Ejercicio3;



public class Coche extends Transporte {

    @Override
    public void moverse(){
        System.out.println("El coche esta en movimiento cerca del aeropuerto");
    }
}
