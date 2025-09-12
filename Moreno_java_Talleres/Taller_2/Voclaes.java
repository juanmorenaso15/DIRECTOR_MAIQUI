import java.util.Scanner;

public class Voclaes {
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine().toLowerCase();

        Integer vocales = 0, consonantes = 0;

        for (Integer i = 0; i<palabra.length(); i++) {
            char letra = palabra.charAt(i);
            
            if ( letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else if (letra>= 'a' && letra<= 'z') {
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        scanner.close();
    }
}
