import java.util.Scanner;

public class ejercicio247 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0, cuadrado;

        System.out.print("Digite un número: ");
        n = scanner.nextInt();

        System.out.print(n + "= 0");

        for (int i = 1; sum < (n * n); i+=2) {
            if (sum + i > n * n) {
                i = 1;
            }
            sum += i;
            System.out.print(" + " + i);
        }

        System.out.println("= " + sum);
    }
}