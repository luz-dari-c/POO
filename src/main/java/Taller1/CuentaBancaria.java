package Taller1;



public class CuentaBancaria {

   public String numeroCuenta;
   public  String saldo;
   public String tipoCuenta;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria() {
        numeroCuenta = "0011-1100-123";
        saldo = "100000000000";
        tipoCuenta = "Corriente";

    }

    public CuentaBancaria (String numeroCuenta, String tipoCuenta){

        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;

    }

    public CuentaBancaria (String numeroCuenta, String saldo, String tipoCuenta){

        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;

    }
    @Override
    public String toString(){
        return "Numero Cuenta: " + numeroCuenta + "\nSaldo: " + saldo + "\nTipo Cuenta: " + tipoCuenta;
    }



}
