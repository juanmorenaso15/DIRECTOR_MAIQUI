package CIEN_EJERCICIOS_JAVA;

import java.util.Random;

public class Diez_mayor_menor_suma_promedio_arreglo {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random mRandom = new Random();
        int menor = 0, mayor = 0, suma = 0, promedio = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = mRandom.nextInt(100);
            System.out.println("\n Array (" + (i + 1) + ") = " + array[i]);

        }
        menor = array[0];
        mayor = array[0];

        for (int i = 0; i < array.length; i++) {
            //Calcular el numero menor del array
            if (array[i] < menor) {
                menor = array[i];
            }
            //calcular el numero mayor del array
            if (array[i] > mayor) {
                mayor = array[i];
            }
            //calcular la suma de los elementos del array  
            suma += array[i];
            System.out.println("\n" + array[i]);
        }
        //calcular el promedio del array
        promedio = suma / array.length;

        System.out.println("\nEl elemento menor es: " + menor);
        System.out.println("\nEl elemento mayor es: " + mayor);
        System.out.println("\nLa suma es: " + suma);
        System.out.println("\nEl primedio es: " + promedio);
    }
}