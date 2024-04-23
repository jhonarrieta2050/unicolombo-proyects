import java.util.Scanner;

public class ejercicio228 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo, clave;

        do {
            System.out.print("\nDigite el código: ");
            codigo = scanner.next();

            System.out.print("Digite la contraseña: ");
            clave = scanner.next();
        } while (!codigo.equals("1") || !clave.equals("1234"));
    }
}