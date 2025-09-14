package CIEN_EJERCICIOS_JAVA;

import java.util.Random;

public class Uno_Generar_Numero_al_azar {

    public static void main(String[] args) {
        // int numero = 0;
        // numero = (int) (Math.random() * 100);
        // System.out.println("El numero es: "+ numero);

        int numero = 0;
        Random random = new Random();
        numero = random.nextInt(100);
        System.out.println("EL numero es: "+numero);
    }
    
}
