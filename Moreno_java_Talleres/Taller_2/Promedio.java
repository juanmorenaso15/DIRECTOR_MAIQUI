import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

        double suma = 0;

        for(Integer i=1; i<=5; i++){
            System.out.println("Ingrese la nota " + i + ":");
            double nota = scanner.nextDouble();
            suma += nota;
        }

        double promedio = suma/5;
        System.out.println("Promedio: " + promedio);

        if (promedio>=3.0) {
            System.out.println("Ha aprobado ");
        } else {
            System.out.println("Ha reprobado ");
        }

        scanner.close();
    }
        
        


}
