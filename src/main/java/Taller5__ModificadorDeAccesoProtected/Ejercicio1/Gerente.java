package Taller5__ModificadorDeAccesoProtected.Ejercicio1;



public class Gerente extends Empleado {

    protected String departamento;

    public Gerente (String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);

    }


}
