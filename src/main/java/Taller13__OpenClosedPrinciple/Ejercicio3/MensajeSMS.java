package Taller13__OpenClosedPrinciple.Ejercicio3;


public class MensajeSMS extends  Mensajero{

    @Override
    public void enviarMensaje(){
        System.out.println("Su mensaje se esta enviando por SMS");
    }
}
