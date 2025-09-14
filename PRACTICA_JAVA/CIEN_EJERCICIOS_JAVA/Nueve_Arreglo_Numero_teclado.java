package CIEN_EJERCICIOS_JAVA;

import java.util.Scanner;

public class Nueve_Arreglo_Numero_teclado {
    public static void main(String[] args) {


        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingresa un numero en la posicion ( "+(i+1)+" ): ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Array (" + (i + 1) + ") = " + array[i]);
        }
        sc.close();
    }
}