package Cuenta;

public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(String titular, int numeroCuenta, double saldo, double limiteSobregiro){
        super(titular, numeroCuenta, saldo);
        this.limiteSobregiro=limiteSobregiro;
    }

    @Override
    public void retirar(double cantidad){
        if (cantidad <=0) {
            System.out.println("El valor a retirar debe ser mayor a 0");
            return;
        }

        double saldoDisponible = getSaldo()+limiteSobregiro;
        if (cantidad > saldoDisponible) {
            System.out.println("Fondos insuficientes. limite alcanzado. maximo disponible: "+saldoDisponible);
            return;
        }

        setSaldo(getSaldo()-cantidad);
        System.out.println("Retiro exitoso: "+cantidad+" nuevo saldo: "+getSaldo());
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("tipo: Cuenta Corriente ");
        System.out.println("limite de sobregiro: "+limiteSobregiro);
        System.out.println("Saldo disponible: "+ (getSaldo()+limiteSobregiro));
    }

    public double getLimiteSobreGiro(){
        return limiteSobregiro;
    }

}
