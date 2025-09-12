package Taller_3;

import java.util.Scanner;

public class Simulacionnotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos estudiantes hay? ");
        int cantidad = scanner.nextInt();
        
        double[] notas = new double[cantidad];
        double suma = 0;
        double mayor = 0;
        double menor = 10;
        
        for (int i = 0; i < cantidad; i = i + 1) {
            System.out.print("Nota del estudiante " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
            
            suma = suma + notas[i];
            
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        
        double promedio = suma / cantidad;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
        scanner.close();
    }
}
