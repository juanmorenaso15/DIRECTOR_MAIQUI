import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero positivo: ");
        Integer numero = scanner.nextInt();

        Integer divisor = 0;

        for(Integer i=1; i<=numero; i++){
            if (numero%i==0) {
                divisor++;
            }
        }

        if (divisor==2) {
            System.out.println("Es primo: " + numero);
        } else {
            System.out.println("No es primo: " + numero);
        }

        scanner.close();
    
    }
}
