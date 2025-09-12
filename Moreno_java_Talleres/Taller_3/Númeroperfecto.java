package Taller_3;

import java.util.Scanner;

public class Númeroperfecto {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        int suma = 0;
        
        for (int i = 1; i < numero; i = i + 1) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        
        if (suma == numero) {
            System.out.println(numero + " es un número perfecto");
        } else {
            System.out.println(numero + " no es un número perfecto");
        }
        scanner.close();
    }
}
