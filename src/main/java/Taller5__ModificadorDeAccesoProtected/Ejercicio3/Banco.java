package Taller5__ModificadorDeAccesoProtected.Ejercicio3;



public class Banco {

    protected long saldo;  // No es seguro, ya que cualquier subclase o clase del mismo paquete puede modificarlo libremente.

}
