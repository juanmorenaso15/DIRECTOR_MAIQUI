package Practicas;

public class CuentaCorriente extends Cuenta {
    private double limiteSobreGiro;

    public CuentaCorriente(String titular, int numeroCuenta, double saldo, double limiteSobreGiro) {
        super(titular, numeroCuenta, saldo);
        this.limiteSobreGiro = limiteSobreGiro;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("El valor a retirar debe ser mayor a cero");
            return;
        }

        double saldoDisponible = getSaldo() + limiteSobreGiro;

        if (cantidad > saldoDisponible) {
            System.out.println("Fondos insuficientes, limite de sobregiro alcanzado. Maximo disponible: " + saldoDisponible);
            return;
        }

        setSaldo(getSaldo() - cantidad);
        System.out.println("Retiro exitoso: " + cantidad + " Nuevo saldo: " + getSaldo());
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Cuenta Corriente");
        System.out.println("Limite de Sobregiro: " + limiteSobreGiro);
        System.out.println("Saldo Disponible: " + (getSaldo() + limiteSobreGiro));
    }

    public double getLimiteSobreGiro() {
        return limiteSobreGiro;
    }
}