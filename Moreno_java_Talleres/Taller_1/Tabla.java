package Taller_1;
import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numro de la tabla d emultiplicar: ");
        Integer numero= scanner.nextInt();

        for(Integer i =1; i<=10; i++){
            System.out.println(numero +" x "+ i + " = "+ (numero*i));
        }
        scanner.close();
    }
}