package Taller4__ModificadorDeAccesoPublic.Ejercicio2;



public class cuentaBancaria {

    private int numeroCuenta;
    private int saldo;
    public String tipoCuenta;

    public cuentaBancaria (int numeroCuenta, int saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void mostrarDetalles(){
        System.out.println("Numero de cuneta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Tipo de cuenta: "+ tipoCuenta);
    }
}