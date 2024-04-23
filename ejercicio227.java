import java.util.Scanner;

public class ejercicio227 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double bocadillo =  1.5, refresco = 1.05, cerveza = 0.75;
        double p1, p2, p3;

        System.out.print("Cantidad de bocadillos de jamón consumidos: ");
        p1 = bocadillo * scanner.nextInt();

        System.out.print("Cantidad de refrescos consumidos: ");
        p2 = refresco * scanner.nextInt();

        System.out.print("Cantidad de cervezas consumidos: ");
        p3 = cerveza * scanner.nextInt();

        System.out.println("\nSubtotal bocadillos de jamón: $" + p1);
        System.out.println("Subtotal refrescos: $" + p2);
        System.out.println("Subtotal cervezas: $" + p2);
        System.out.println("Total: $" + (p1 + p2 + p3));
    }
}