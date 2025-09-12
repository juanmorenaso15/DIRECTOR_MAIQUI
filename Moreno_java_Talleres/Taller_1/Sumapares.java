package Taller_1;
import java.util.Scanner;

public class Sumapares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Ingrese un numero entero positivo: ");
        Integer numero = scanner.nextInt();

        Integer suma = 0;
        for(Integer i=1; i<=numero; i++){
            if(i%2==0){
                suma += i;
            }
        }

        System.out.print("La suma de los numeros pares hasta " + numero + " es: " + suma);

        scanner.close();
    }
}
