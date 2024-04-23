import java.util.Scanner;

public class ejercicio230 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;

        do {
            System.out.print("Digite el primer número: ");
            n1 = scanner.nextDouble();

            System.out.print("Digite el segundo número: ");
            n2 = scanner.nextDouble();

            if ((n1 > 0 && n2 > 0) && (n1 > n2)) {
                System.out.println("División: " + (n1 / n2));
                break;
            }else{
                System.out.println("Los datos ingresados no cumplen las condiciones necesarias.\n");
            }
        } while (true);
    }
}