package CIEN_EJERCICIOS_JAVA;

import java.util.Scanner;

public class Siete_Determinar_Numero_Veces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la cadena: ");
        String cadena = sc.nextLine();

        System.out.print("Ingresa el caracter a determinar el nuemro de repeticiones: ");
        char caracter = sc.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)== caracter) {
                contador++;
            }
        }
        System.out.println("El caracter \"" + caracter+ "\" se repite " + contador+ " veces en la cadena \""+cadena+"\"");
        sc.close();
    }
    
}