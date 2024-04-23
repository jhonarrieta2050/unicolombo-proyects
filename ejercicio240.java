import java.util.Scanner;

public class ejercicio240 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, sum = 0;

        System.out.print("Digite el multiplicando: ");
        n1 = scanner.nextInt();

        System.out.print("Digite el multiplicador: ");
        n2 = scanner.nextInt();

        System.out.print("\n" + n1 + " * " + n2 + " = (");

        for (int i = 1; i < n2; i++) {
            System.out.print(n1 + " + ");

            sum += n1;
        }
        sum += n1;
        System.out.println(n1 + ") = " + sum);
    }
}