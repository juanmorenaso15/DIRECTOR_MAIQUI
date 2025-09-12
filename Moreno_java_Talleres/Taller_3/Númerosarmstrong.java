package Taller_3;

import java.util.Scanner;

public class Númerosarmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        int original = numero;
        
        int suma = 0;
        int digitos = String.valueOf(numero).length();
        
        while (numero > 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, digitos);
            numero = numero / 10;
        }
        
        if (suma == original) {
            System.out.println(original + " es número Armstrong");
        } else {
            System.out.println(original + " no es número Armstrong");
        }
        scanner.close();
    
    }
}
