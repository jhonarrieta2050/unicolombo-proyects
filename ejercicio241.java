import java.util.Scanner;

public class ejercicio241 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, rest, cont = 0;

        System.out.print("Digite el dividendo: ");
        n1 = scanner.nextInt();

        System.out.print("Digite el divisor: ");
        n2 = scanner.nextInt();

        rest = n1;
        System.out.print("\n" + n1 + " / " + n2 + " = (");

        System.out.print(n1 + " - ");

        do {
            if (rest - (n2 * 2) < 0) {
                break;
            }
            rest -= n2;
            cont ++;
            System.out.print(n2 + " - ");
        } while (rest > n2);

        rest -= n2;
        cont++;
        System.out.println(n2 + ") = " + cont);        
    }
}