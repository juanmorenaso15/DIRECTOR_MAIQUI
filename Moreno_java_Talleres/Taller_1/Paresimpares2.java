package Taller_1;
import java.util.Scanner;

public class Paresimpares2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo: ");
        Integer numero = scanner.nextInt();

        for (Integer i=1; i<numero; i++){
            if(i%2==0){
                System.out.println("El numero es par: "+i);
            }else{
                System.out.println("El numero es impar: "+i);
            }
        }
        scanner.close();
    }
}
