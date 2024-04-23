import java.util.Scanner;

public class ejercicio239 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Digite un número: ");
            num = scanner.nextInt();

            sum += num;
        
        } while (num != 999);

        sum -= 999;

        System.out.println("La suma de los números es: " + sum);
    }
}