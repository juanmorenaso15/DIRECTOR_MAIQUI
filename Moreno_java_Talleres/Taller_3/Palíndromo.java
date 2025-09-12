package Taller_3;

import java.util.Scanner;

public class Palíndromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        
        String palabraReversa = "";
        
        // Construir la palabra al revés
        for (int i = palabra.length() - 1; i >= 0; i = i - 1) {
            palabraReversa = palabraReversa + palabra.charAt(i);
        }
        
        // Comparar
        if (palabra.equalsIgnoreCase(palabraReversa)) {
            System.out.println("¡Es un palíndromo!");
        } else {
            System.out.println("No es un palíndromo");
        }
        scanner.close();
    }
}
