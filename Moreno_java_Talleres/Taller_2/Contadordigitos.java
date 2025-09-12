import java.util.Scanner;

public class Contadordigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        Integer numero = scanner.nextInt();
        Integer contador = 0;

        if (numero ==0) {
            contador = 1;
        } else {
            while (numero != 0) {
                numero = numero /10;
                contador++;
            }
        }

        System.out.println("El numero tiene "  + contador + " digitos");

        scanner.close();

    }
}
