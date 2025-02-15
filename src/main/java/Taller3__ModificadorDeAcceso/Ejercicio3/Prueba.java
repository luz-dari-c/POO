package Taller3__ModificadorDeAcceso.Ejercicio3;



public class Prueba {
    public static void main(String[] args) {

        Persona persona = new Persona("Luz",  19);


        //Para acceder al nombre hay que hacerlo a traves del metodo get, ya que es privado.
        System.out.println("Nombre: " + persona.getNombre());

        System.out.println("Edad: " + persona.edad);

       persona.presentare();


    }
}
