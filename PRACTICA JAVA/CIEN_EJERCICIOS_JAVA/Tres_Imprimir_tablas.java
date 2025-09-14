package CIEN_EJERCICIOS_JAVA;

// import java.util.Scanner;

public class Tres_Imprimir_tablas {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese un numero del 1 al 10: ");
        // int num = sc.nextInt();

        // System.out.println("Tabla del: "+ num);

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(num + " x " + i + " = "+ (num*i));
        // }
        // sc.close();


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}