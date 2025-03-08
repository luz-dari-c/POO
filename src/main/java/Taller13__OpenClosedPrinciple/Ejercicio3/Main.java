package Taller13__OpenClosedPrinciple.Ejercicio3;


public class Main {
    public static void main(String[] args) {

        Mensajero mensajeCorreo = new MensajeCorreo();
        Mensajero mensajePush = new MensajeNotificacionPush();
        Mensajero mensajeSMS = new MensajeSMS();


        mensajePush.enviarMensaje();
        mensajeSMS.enviarMensaje();
        mensajeCorreo.enviarMensaje();

    }
}
