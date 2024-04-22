import java.util.Scanner;

public class ejercicio142 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingrese el número base (N): ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la potencia (X): ");
        int potencia = scanner.nextInt();

    
        double resultado = calcularPotencia(base, potencia);

    
        System.out.println(base + " elevado a la potencia " + potencia + " es igual a: " + resultado);

        scanner.close();
    }

    public static double calcularPotencia(double base, int potencia) {
        
        if (potencia == 0) {
            return 1;
        }
        
        double resultado = 1;
        
        for (int i = 1; i <= Math.abs(potencia); i++) {
            resultado *= base;
        }

        if (potencia < 0) {
            resultado = 1 / resultado;
        }
        return resultado;
    }
}