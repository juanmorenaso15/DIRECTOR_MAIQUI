package CIEN_EJERCICIOS_JAVA;

import java.util.Random;

public class Ocho_Arreglo_con_numeros_aleatorios {
    public static void main(String[] args) {

        int [] array = new int[100];
        Random mRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= mRandom.nextInt(100);
            System.out.println("Array (" + (i+1) + ") = "+ array[i]);
        }

    }   
}
