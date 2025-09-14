package CIEN_EJERCICIOS_JAVA;

import java.util.Scanner;

public class Dos_Pedir_Numeros {
    public static void main(String[] args) {
         Scanner sc =  new Scanner (System.in);
         int opc = -1;
         int num = 0;

         while (opc!=2) {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
            System.out.println("El numero ingresado es: " + num);

            System.out.println("Desea continuar? [1=si/2=no]");
            opc=sc.nextInt();

            
         }
         sc.close();
    }
}
