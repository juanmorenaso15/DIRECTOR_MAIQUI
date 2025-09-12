package Taller_1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        Integer numero = scanner.nextInt();
        long factorial = 1;
        for(Integer i=1; i<numero; i++){
            factorial *= i;
        }
        System.out.println("El factorial de: " + numero + " es "+ factorial);
        scanner.close();
    }   
}
