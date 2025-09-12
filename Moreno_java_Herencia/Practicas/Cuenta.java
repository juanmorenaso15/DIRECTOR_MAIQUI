package Practicas;

public class Cuenta {
    private String titular;
    private int numeroCuenta;
    private double saldo;

    public Cuenta(String titular, int numeroCuenta, double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

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
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito exitoso: " + valor);
        } else {
            System.out.println("El valor debe ser mayor a 0");
        }
    }

    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("El retiro ha sido exitoso: " + valor);
        } else {
            System.out.println("Valor invalido ");
        }
    }

    public void transferir(double valor, Cuenta cuentaDestino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + valor);
            System.out.println("La transferencia de " + valor + " a la cuenta de " + cuentaDestino.getTitular() + " ha sido exitosa");
        } else {
            System.out.println("No se pudo lograr la transferencia");
        }
    }
}