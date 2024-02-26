import java.util.Scanner;

public class ejercicio47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad comprada:");
        double cantidadComprada = scanner.nextDouble();

        System.out.println("Introduce el precio original:");
        double precioOriginal = scanner.nextDouble();

        System.out.println("Introduce el precio pagado:");
        double precioPagado = scanner.nextDouble();

    
        double diferenciaPrecios = precioOriginal - precioPagado;

    
        double porcentajeDescontado = (diferenciaPrecios / precioOriginal) * 100;

        System.out.println("El porcentaje descontado es: " + porcentajeDescontado + "%");

        scanner.close();
    }
}