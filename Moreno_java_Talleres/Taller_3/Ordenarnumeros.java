package Taller_3;

import java.util.Scanner;

public class Ordenarnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Por favor, ingrese 10 números:");

        for (int i = 0; i < 10; i = i + 1) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros ingresados:");
        for (int i = 0; i < 10; i = i + 1) {
            System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length - 1; i = i + 1) {
            for (int x = 0; x < numeros.length - i - 1; x = x + 1) {
                if (numeros[x] > numeros[x + 1]) {

                    int temp = numeros[x];
                    numeros[x] = numeros[x + 1];
                    numeros[x + 1] = temp;
                }
            }
        }

        System.out.println("\n\nNúmeros ordenados de menor a mayor:");
        for (int i = 0; i < 10; i = i + 1) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}