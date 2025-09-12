package Taller_1;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese numero n: ");
        Integer numero = scanner.nextInt();

        Integer a=0, b=1;

        for(Integer i=1; i<numero; i++){
            System.out.println( a + " ");
            Integer valor = a + b;
            a = b;
            b = valor;
        }

        scanner.close();
    }
}
