import java.util.Scanner;

public class ejercicio206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Ingrese el salario anterior del obrero:");
        double salarioAnterior = scanner.nextDouble();

    
        double incremento = 0.25;

    
        double nuevoSalario = salarioAnterior + (salarioAnterior * incremento);

    
        System.out.println("El nuevo salario del obrero es: $" + nuevoSalario);

        scanner.close();
    }
}
