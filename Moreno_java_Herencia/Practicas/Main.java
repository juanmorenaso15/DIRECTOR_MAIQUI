package Practicas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cuenta de Ahorros
        System.out.println("=== Crear Cuenta de Ahorros ===");
        System.out.print("Titular: ");
        String titularAhorros = sc.nextLine();
        System.out.print("Número de cuenta: ");
        int numAhorros = sc.nextInt();
        System.out.print("Saldo inicial: ");
        double saldoAhorros = sc.nextDouble();
        System.out.print("Tasa de interés (ejemplo 0.04): ");
        double tasaInteres = sc.nextDouble();

        CuentaAhorros cuentaAhorros = new CuentaAhorros(titularAhorros, numAhorros, saldoAhorros, tasaInteres);

        cuentaAhorros.mostrarInformacion();

        System.out.print("¿Cuánto desea depositar en la cuenta de ahorros?: ");
        double depositoAhorros = sc.nextDouble();
        cuentaAhorros.depositar(depositoAhorros);

        System.out.print("¿Cuánto desea retirar de la cuenta de ahorros?: ");
        double retiroAhorros = sc.nextDouble();
        cuentaAhorros.retirar(retiroAhorros);

        cuentaAhorros.aplicarInteres();

        sc.nextLine(); // Limpiar buffer

        // Cuenta Corriente
        System.out.println("\n=== Crear Cuenta Corriente ===");
        System.out.print("Titular: ");
        String titularCorriente = sc.nextLine();
        System.out.print("Número de cuenta: ");
        int numCorriente = sc.nextInt();
        System.out.print("Saldo inicial: ");
        double saldoCorriente = sc.nextDouble();
        System.out.print("Límite de sobregiro: ");
        double limiteSobregiro = sc.nextDouble();

        CuentaCorriente cuentaCorriente = new CuentaCorriente(titularCorriente, numCorriente, saldoCorriente, limiteSobregiro);

        cuentaCorriente.mostrarInformacion();

        System.out.print("¿Cuánto desea depositar en la cuenta corriente?: ");
        double depositoCorriente = sc.nextDouble();
        cuentaCorriente.depositar(depositoCorriente);

        System.out.print("¿Cuánto desea retirar de la cuenta corriente?: ");
        double retiroCorriente = sc.nextDouble();
        cuentaCorriente.retirar(retiroCorriente);

        sc.close();
    }
}