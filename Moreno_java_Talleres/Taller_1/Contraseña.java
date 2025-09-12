package Taller_1;
import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contraseñaValida = "sena2025";
        String contraseña = "";

        System.out.println("Vas a tener 3 intentos para ingresar la contraseña correcta: ");

        for(Integer i=1; i<=3; i++){
            System.out.print("Intento numero " + i + " : ");
            contraseña = scanner.nextLine();

            if(contraseña.equals(contraseñaValida)){   
                System.out.println("Contraseña correcta ");
                break;
            } else {
                System.out.println("Contraseña incorrecta ");
            }

            if (i==3) {
                System.out.print("Se te han acabado los intentos ");
            }
        }

        scanner.close();
    }
}
