import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero 1: ");
        Integer numero1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");
        Integer numero2 = scanner.nextInt();

        System.out.println("Ingrese la operacion (+, -, *, /) : ");
        char operacion = scanner.next().charAt(0);

        if (operacion == '+') {
            System.out.println("Resultado: " + (numero1 + numero2));
        }
        if (operacion == '-') {
            System.out.println("Resultado: " + (numero1 - numero2));
        }
        if (operacion == '*') {
            System.out.println("Resultado: " + (numero1 * numero2));
        }
        if (operacion == '/') {
            System.out.println("Resultado: " + (numero1 / numero2));
        }

        scanner.close();

    }
}