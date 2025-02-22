package Taller9__HerenciaMultiple_UsoInterfaz.Ejercicio1;


public class Ave implements Volador, Cantante{
    @Override
    public void cantar() {
        System.out.println("El ave está cantando");
    }

    @Override
    public void volar() {
        System.out.println("El ave esta volando");
    }
}
