package Cuenta;
//¿Por qué privados? Para que solo se puedan modificar mediante métodos controlados de la misma clase.
public class Cuenta {
    private String titular;
    private int numeroCuenta;
    private double saldo; //double para decimales

    public Cuenta(String titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //GETTERS
    //Propósito: Permitir leer los valores privados desde otras clases.
    public String getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //SETTERS
    //Propósito: Modificar los valores de manera controlada.

    public void setTitular(String nuevoTitular) {
        this.titular = nuevoTitular;

    }
    public void setNumeroCuenta(int nuevoNumeroCuenta) {
        this.numeroCuenta = nuevoNumeroCuenta;
    }
    public void setSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de Cuneta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito Exitoso: " + valor);
        }else{
            System.out.println("El valor debe ser mayor a 0");
        }
    }

    public void retirar (double valor){
        if(valor>0 && valor <=saldo){
            saldo-=valor;
            System.out.println("Reitiro Exitoso: "+valor);
        }else{
            System.err.println("Valor invalido");
        }
    }

    public void transferir(double valor, Cuenta cuentaDestino){
        if (valor>0 && valor <=0) {
            saldo -= valor;
            cuentaDestino.setSaldo(cuentaDestino.getSaldo()+valor);
            System.out.println("La transfereci de "+ valor + "a la cuenta de "+ cuentaDestino.getTitular()+ "Ha sido exitosa");
        }else{
            System.out.println("No se puede lograr la tranferencia");
        }
    }

    


}