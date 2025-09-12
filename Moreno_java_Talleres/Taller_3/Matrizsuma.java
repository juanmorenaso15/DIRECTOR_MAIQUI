package Taller_3;

import java.util.Scanner;

public class Matrizsuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];
        
        System.out.println("Primera matriz:");
        for (int i = 0; i < 2; i = i + 1) {
            for (int x = 0; x < 2; x = x + 1) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (x + 1) + ": ");
                matriz1[i][x] = scanner.nextInt();
            }
        }
        
        System.out.println("Segunda matriz:");
        for (int i = 0; i < 2; i = i + 1) {
            for (int x = 0; x < 2; x = x + 1) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (x + 1) + ": ");
                matriz2[i][x] = scanner.nextInt();
            }
        }
        
        for (int i = 0; i < 2; i = i + 1) {
            for (int x = 0; x < 2; x = x + 1) {
                resultado[i][x] = matriz1[i][x] + matriz2[i][x];
            }
        }
        
        System.out.println("Resultado de la suma:");
        for (int i = 0; i < 2; i = i + 1) {
            for (int x = 0; x < 2; x = x + 1) {
                System.out.print(resultado[i][x] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
