package Taller8__UsoDeSuper.Ejercicio3;

public class Computadora extends Dispositivo {
    private int memoriaRAM;

    public Computadora(String modelo, int memoriaRAM) {
        super(modelo);
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void mostrarModelo() {
        super.mostrarModelo();
        System.out.println("Memoria RAM: " + memoriaRAM + " GB");
    }

    public void intentoAccesoPrivado() {
        // No se puede acceder directamente a 'modelo' porque es privado en la clase base
         // System.out.println(super.modelo); // Esto causará un error de compilación
    }
}