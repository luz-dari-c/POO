package Taller9__HerenciaMultiple_UsoInterfaz.Ejercicio4;


public class Persona implements Hablador, Trabajador{
    @Override
    public void hablar() {
        System.out.println("La persona se encuentra hablando");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona está trabajando");
    }
}
