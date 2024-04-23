import java.util.Scanner;

public class ejercicio231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = new int[10], sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite un número ("+(i + 1) + "/10): ");
            num[i] = scanner.nextInt();

            if (num[i] > 0) {
                sum += num[i]; 
            }
        }

        System.out.println("\nSuma: " + sum);
        for (int i : num) {
            System.out.println(i);
        }
    }
}