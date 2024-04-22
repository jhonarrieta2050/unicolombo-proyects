import java.util.Scanner;

public class ejercicio204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el valor en dólares:");
        double dolares = scanner.nextDouble();

        double tasaDeCambio = 8.08;

    
        double bolivianos = dolares * tasaDeCambio;

        // Mostrar el resultado
        System.out.println("$" + dolares + " dólares son " + bolivianos + " bolivianos.");

        scanner.close();
    }
}