package Cuenta;

public class CuentaAhorros extends Cuenta{
    private double tasaInteres;

    public CuentaAhorros(String titular, int numeroCuenta, double saldo, double tasaInteres){
        super(titular, numeroCuenta, saldo); //llama al constructor de clase base
        this.tasaInteres=tasaInteres;
    }

    @Override
    public void retirar(double cantidad){
        if (cantidad<=0) {
            System.out.println("EL valor debe ser mayor a 0");
            return;
        }
        double maximoRetiro = getSaldo()*0.04;

        if (cantidad > maximoRetiro) {
            System.out.println("No se peude retirar mas del 4% de tu saldo. Maximo por retiro: "+ maximoRetiro);
            return;
        }

        if (cantidad > getSaldo()) {
            System.out.println("Fondos insuficientes, no se pudo realizar el retiro");
            return;
        }

        setSaldo(getSaldo()-cantidad);
        System.out.println("Retiro exitoso: "+cantidad+ " Nuevo saldo: "+ getSaldo());
    }

    public void aplicarInteres(){
        double interes = getSaldo() * tasaInteres;
        setSaldo(getSaldo()+interes);
        System.out.println("Interes aplicado: "+interes+" Nuevo saldo: "+ getSaldo());
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo: Cuenta Ahorros ");
        System.out.println("Tasa de interes: "+ (tasaInteres*100)+"%");
    }

    public double getTasaInteres(){
        return tasaInteres;
    }

}
