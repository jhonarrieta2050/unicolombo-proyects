import java.util.Scanner;

public class ejercicio229 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        do {
            System.out.print("Digite el primer número par: ");
            n1 = scanner.nextInt();

            System.out.print("Digite el segundo número par: ");
            n2 = scanner.nextInt();

            if (n1%2 == 0 && n2%2 == 0) {
                System.out.println("La suma de los números es: " + (n1 + n2));
            }else{
                System.out.println("Error: uno de los números introducidos no es par.");
            }
        } while (n1 != 0 && n2 != 0);
    }
}