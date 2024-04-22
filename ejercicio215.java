import java.util.Scanner;
public class ejercicio215 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.println("Ingrese el kilometraje de la última vez que se reportó:");
        double kilometrajeAnterior = scanner.nextDouble();

    
        System.out.println("Ingrese el kilometraje actual:");
        double kilometrajeActual = scanner.nextDouble();

    
        System.out.println("Ingrese los litros de gasolina repostados la última vez:");
        double litrosAnteriores = scanner.nextDouble();

    
        System.out.println("Ingrese la cantidad de gasolina actual:");
        double litrosActuales = scanner.nextDouble();

    
        double distanciaRecorrida = kilometrajeActual - kilometrajeAnterior;

    
        double litrosConsumidos = litrosAnteriores - litrosActuales;

    
        double consumoMedio = (litrosConsumidos / distanciaRecorrida) * 100;

        System.out.println("El consumo medio es de: " + consumoMedio + " litros cada 100 kilómetros");

        scanner.close();
    }
}