package Taller8__UsoDeSuper.Ejercicio3;



public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Lenovo", 16);
        computadora.mostrarModelo();
   //     computadora.intentoAccesoPrivado();   -------> Mostrará el error de acceso privado
    }
}
