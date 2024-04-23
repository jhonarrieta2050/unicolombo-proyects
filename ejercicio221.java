import java.util.Scanner;

public class ejercicio221 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String clave = "eureka";
        String clave2;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite la clave: ");
            clave2 = scanner.next();

            if (!clave2.equals(clave)) {
                if (i  == 2) {
                    System.out.println("Clave incorrecta, demasiados intentos fallidos.");
                    break;
                } 
                System.out.println("Clave incorrecta, inténtelo nuevamente.\n");
            } else {
                System.out.println("Clave correcta.");
                break;
            }
        }
    }
}