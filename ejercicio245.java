import java.util.Scanner;

public class ejercicio245 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Digite un número: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2); 
        }

        System.out.println("La suma de los " + n + " primeros números primos es: " + sum);
    }
}