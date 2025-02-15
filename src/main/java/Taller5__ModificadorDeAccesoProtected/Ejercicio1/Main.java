package Taller5__ModificadorDeAccesoProtected.Ejercicio1;

/****************************************************
 Developer Name: Luz Dari Crespo Gómez
 Developer Contact: luzdaricrespo@gmail.com
 Created On: 15/02/2025 17:00
 Project Name: POO-JHON-ARRIETA
 ****************************************************/
public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Luis", 120000);
        System.out.println("Empleado");
        empleado.mostrarInformacion();
        System.out.println();
        System.out.println("Gerente");
        Gerente gerente = new Gerente("Mark", 5000000, "Bolivar");
        gerente.mostrarInformacion();
    }
}
