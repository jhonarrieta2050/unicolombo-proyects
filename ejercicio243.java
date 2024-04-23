import java.util.Scanner;

public class ejercicio243 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite un número para determinar si es primo: ");
        n = scanner.nextInt();

        if (n > 0) {
            if (n%2 != 0 || n%3 != 0 || n%5 != 0) {
                System.out.println("Es un número primo.");
            }else{
                System.out.println("No es un número primo.");
            }
        }else{
            System.out.println("El número ingresado no es válido.");
        }
    }
}