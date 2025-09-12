package Taller_3;

import java.util.Scanner;

public class Frecuencianumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < 10; i = i + 1) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\nFrecuencia:");
        for (int i = 0; i < 10; i = i + 1) {
            if (numeros[i] != -1) { 
                int contador = 1;

                for (int x = i + 1; x < 10; x = x + 1) {
                    if (numeros[i] == numeros[x]) {
                        contador = contador + 1;
                        numeros[x] = -1;
                    }
                }
                
                System.out.println(numeros[i] + " aparece " + contador + " veces");
            }
        }
        scanner.close();
    }
}
