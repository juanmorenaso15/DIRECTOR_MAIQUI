import java.util.Scanner;

public class Conversortemperatura {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese temperatura en Celsius: ");
        double Celsius = scanner.nextDouble();

        double Farenheit = (Celsius*9/5) + 32;
        double Kelvin = Celsius + 273.15;

        System.out.println("Farenheit: " + Farenheit);
        System.out.println("Kelvin: " + Kelvin);

        scanner.close();
    }
}
