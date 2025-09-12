import java.util.Scanner;

public class Reservanumero {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        Integer numero = scanner.nextInt();
        Integer reversa = 0;

        while (numero>0) {
            Integer digito = numero % 10;
            reversa = reversa *10 + digito;
            numero = numero /10;
        }

        System.out.println("Numero invertido: " + reversa);

        scanner.close();
    }
}
