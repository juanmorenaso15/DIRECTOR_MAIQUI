package Taller_1;
import java.util.Scanner;

public class Mo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer secreto = 25;
        Integer intento = 0;

        System.out.println("Adivina el numero entre el 1 y 50 (tienes 15 intentos): ");

        for(Integer i=1; i<=15; i++){
            System.out.print("Intento numero " + i + " : ");
            intento = scanner.nextInt();

            if(intento<secreto){
                System.out.println("El numero es menor ");
            } else if(intento>secreto) {
                System.out.println("El numero es mayor ");
            } else {
                System.out.print("Felicidades. Haz adivinado el numero: " + secreto); 
                break;
            }

            if(i==15){
                System.out.print("Se te han acabado los intentos ");
            }
        }

        scanner.close();

    }
}
