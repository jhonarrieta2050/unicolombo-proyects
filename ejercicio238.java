import java.util.Scanner;

public class ejercicio238 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char numbs[];
        String n;
        int sum = 0;

        System.out.print("Digite un número entero: ");
        n = scanner.next();

        numbs = new char[n.length()];

        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = n.charAt(i);
        }

        for (char c : numbs) {
            sum += c - '0';
        }

        System.out.println("La suma de los valores es: " + sum);
    }
}