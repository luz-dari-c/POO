package Taller13__OpenClosedPrinciple.Ejercicio1;



public class descuentoPorcentaje  extends Descuento{

    private double porcentaje;

    public descuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public  double descuento( double precio){

        return precio - (precio * (porcentaje / 100));

    }
}
