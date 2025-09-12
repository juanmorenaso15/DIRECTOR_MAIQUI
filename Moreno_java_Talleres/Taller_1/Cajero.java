package Taller_1;
import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);     

        Integer saldo = 1000000;
        Integer opcion = 0;

        while (opcion!=4) {
        System.out.println("Cajero\n ");
        System.out.println("1. Consultar saldo ");
        System.out.println("2. Retirar dinero ");
        System.out.println("3. Depositar dinero ");
        System.out.println("4. Salir ");
        opcion = scanner.nextInt();

        if(opcion==1){
            System.out.println("Su saldo es: " + saldo);
        } else if(opcion==2){
        System.out.println("Ingresa la cantidad que quieres retirar: ");
        Integer retiro =scanner.nextInt();
        if (retiro<=saldo) {
            saldo -= retiro;
            System.out.println("El retiro ha sido exitoso. Saldo: " + saldo);
        } else {
            System.out.println("El saldo es insuficiente ");
        }
        } else if (opcion==3) {
            System.out.println("Ingrese la cantidad de dinero que quiere depositar : ");
            Integer deposito = scanner.nextInt();
            saldo += deposito;
            System.out.println("El deposito ha sido exitoso. Saldo: " + saldo);
        } else if (opcion==4) {
            System.out.println("Hasta luego ");
        } else {
            System.out.println("Opcion no valida ");
        }
        }
        scanner.close();
    }
}
