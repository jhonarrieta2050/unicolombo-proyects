import java.util.Scanner;

public class ejercicio244 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite un número: ");
        n = scanner.nextInt();

        if (n < 20 && n > 20) {
            if (n%2 != 0 || n%3 != 0 || n%5 != 0) {
                System.out.println("Es un número primo.");
            }else{
                System.out.println("No es un número primo.");
            }
        }else{
            System.out.println("Error: el número debe ser positivo y menor que 20.");
        }
    }
}