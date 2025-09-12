package Taller_1;
import java.util.Scanner;

public class Edad1 {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                    System.out.println("Ingrese su edad: ");
                    Integer edad = scanner.nextInt();
                    if (edad<12) {
                        System.out.println("eres un niño");
                    } else if (edad >=13 && edad <=17) {
                        System.out.println("Eres un adolecente");
                    }else if (edad >= 60 && edad <=100) {
                        System.out.println("esre un adulto mayor");
                    }else{
                        System.out.println("Estas muerto");
                    }
                  scanner.close();  
    }
}