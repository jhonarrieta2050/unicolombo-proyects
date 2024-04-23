import java.util.Scanner;

public class Ejercicio251 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, cont = 0;

        do {
            System.out.print("Digite un número: ");
            n = scanner.nextInt();

            if (n > 5) {
                cont++;
            }
        } while (n > 5);

        System.out.println("\nNúmero: " + n);
        System.out.println("Intentos fallidos: " + cont);
    }
}