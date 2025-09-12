package Taller_1;
import java.util.Scanner;

public class Mayormanor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         Integer mayor , menor;
         System.out.println("Ingrese el numero 1: ");
         Integer numero = scanner.nextInt();
         mayor = numero;
         menor = numero;

         for (Integer i=2; i<=5; i++ ){
            System.out.println("Ingrese el numero: " + i + ": ");
            numero = scanner.nextInt();
             if (numero>mayor) {
                mayor=numero;
            } if (numero<menor) {
                menor=numero;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        scanner.close();
         }
    
}
