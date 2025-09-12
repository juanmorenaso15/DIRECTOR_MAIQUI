package Taller_3;

import java.util.Scanner;

public class Sistemainventariosimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productos = new String[50];
        int[] cantidades = new int[50];
        int total = 0;
        
        while (true) {
            System.out.println("\n--- INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Ver productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (total < 50) {
                        System.out.print("Nombre del producto: ");
                        productos[total] = scanner.nextLine();
                        System.out.print("Cantidad: ");
                        cantidades[total] = scanner.nextInt();
                        total++;
                        System.out.println("Producto agregado!");
                    } else {
                        System.out.println("Inventario lleno!");
                    }
                    break;
                    
                case 2:
                    if (total == 0) {
                        System.out.println("No hay productos");
                    } else {
                        for (int i = 0; i < total; i = i + 1) {
                            System.out.println((i + 1) + ". " + productos[i] + " - " + cantidades[i]);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Producto a buscar: ");
                    String buscar = scanner.nextLine();
                    boolean encontrado = false;
                    
                    for (int i = 0; i < total; i = i + 1) {
                        if (productos[i].equalsIgnoreCase(buscar)) {
                            System.out.println("Encontrado: " + productos[i] + " - " + cantidades[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                    
                case 4:
                    System.out.println("¡Adiós!");
                     scanner.close();
                    return;
                    
                default:
                    System.out.println("Opción no válida");
                    
            }
        }
       
    }
}
