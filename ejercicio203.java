import java.util.Scanner;

public class ejercicio203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

    
        double pulsaciones = (220.0 - edad) / 10.0;

    
        System.out.println("El número de pulsaciones por cada 10 segundos es: " + pulsaciones);

        scanner.close();
    }
}