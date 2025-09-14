package CIEN_EJERCICIOS_JAVA;

import java.util.Scanner;

public class Cuatro_Imprimir_Torres_Asteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el numero de filas de la torres: ");
        int tam = sc.nextInt();
        for (int altura = 1; altura <= tam; altura++) {

            for (int e = 1; e <= (tam-altura); e++) {
                System.out.print(" ");
                
            }
            
            for (int i = 1; i <= (altura*2)-1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
