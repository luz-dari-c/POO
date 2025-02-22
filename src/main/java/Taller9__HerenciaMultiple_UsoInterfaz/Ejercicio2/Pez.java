package Taller9__HerenciaMultiple_UsoInterfaz.Ejercicio2;



public class Pez implements Nadador, Respirador {
    @Override
    public void respirar() {
        System.out.println("El pez está respirando");
    }

    @Override
    public void nadar() {
        System.out.println("El pez está nadando en el mediterraneo");
    }
}
