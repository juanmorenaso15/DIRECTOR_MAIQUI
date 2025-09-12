package Taller_3;

import java.util.Scanner;

public class Converosmonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double DOLAR = 3900; 
        final double EURO = 4200; 
        
        System.out.print("Ingresa la cantidad en pesos: ");
        double pesos = scanner.nextDouble();
        
        double dolares = pesos / DOLAR;
        double euros = pesos / EURO;
        
        System.out.println("\n--- CONVERSIÓN ---");
        System.out.println("Pesos: " + pesos);
        System.out.println("Dólares: " + dolares);
        System.out.println("Euros: " + euros);
        scanner.close();
    }
}
