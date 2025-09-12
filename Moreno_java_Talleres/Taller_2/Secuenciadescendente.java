import java.util.Scanner;

public class Secuenciadescendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.println("Ingrese un numero entero positivo: ");
        Integer numero = scanner.nextInt();

        for(Integer i=numero; i>=1; i--){
            System.out.println(i);
        }

        scanner.close();
    }
}
