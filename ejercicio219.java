import java.util.Scanner;

public class ejercicio219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el valor de N:");
        int N = scanner.nextInt();


        int suma = 0;


        for (int i = 1; i <= N; i++) {
            int numeroPar = 2 * i;


            suma += numeroPar;
        }


        System.out.println("La suma de los " + N + " primeros números pares es: " + suma);

        scanner.close();
    }
}