import java.util.Scanner;

public class ejercicio248 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n2[] = new double[5], sum = 0, n, a;

        System.out.print("Digite la cantidad de alumnos: ");
        a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print("Digite la nota del alumno #" + i + ": ");
            n = scanner.nextDouble();

            sum += n;
        }

        System.out.println("\nSuma de las notas: " + sum);
        System.out.println("Promedio de las notas: " + (sum / a));
    }
}