import java.util.Scanner;

public class ejercicio225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Digite un número par: ");
        num = scanner.nextInt();

        if (num%2 != 0) {
            System.out.println("Error: Valor no válido.");
        }

        for (int i = 0; i < (num/2); i++) {
            for (int j = 0; j < (num/2); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}