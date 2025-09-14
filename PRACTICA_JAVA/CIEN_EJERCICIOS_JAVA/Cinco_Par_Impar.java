package CIEN_EJERCICIOS_JAVA;

import java.util.Scanner;

public class Cinco_Par_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par: "+num);
        }else{
            System.out.println("El numero e impar: "+num);
        }
        sc.close();
    }
}
