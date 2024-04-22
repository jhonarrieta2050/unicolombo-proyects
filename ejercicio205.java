import java.util.Scanner;

public class ejercicio205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Ingrese la cantidad en bolivianos:");
        double bolivianos = scanner.nextDouble();

    
        System.out.println("Ingrese el tipo de cambio (1 dólar = X bolivianos):");
        double tipoDeCambio = scanner.nextDouble();

        double dolares = bolivianos / tipoDeCambio;

    
        System.out.println(bolivianos + " bolivianos son $" + dolares + " dólares.");

        scanner.close();
    }
}