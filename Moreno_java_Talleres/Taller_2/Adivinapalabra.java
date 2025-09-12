import java.util.Scanner;

public class Adivinapalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "java";
        String intento = "";

        while (!intento.equals(palabraSecreta)) {
            System.out.println("Adivina la palabra: ");
            intento = scanner.nextLine();

            if (!intento.equals(palabraSecreta)) {
                System.out.println("Esta incorrecto, debes intentar de nuevo ");
            }
        }

        System.out.println("Adivinaste, la palabra es: " + palabraSecreta);

        scanner.close();
    }


}