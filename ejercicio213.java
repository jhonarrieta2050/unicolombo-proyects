import java.util.Scanner;

public class ejercicio213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el tiempo de carrera del lunes (en minutos):");
        double tiempoLunes = scanner.nextDouble();

        System.out.println("Ingrese el tiempo de carrera del miércoles (en minutos):");
        double tiempoMiercoles = scanner.nextDouble();

        System.out.println("Ingrese el tiempo de carrera del viernes (en minutos):");
        double tiempoViernes = scanner.nextDouble();

        
        double tiempoPromedio = (tiempoLunes + tiempoMiercoles + tiempoViernes) / 3.0;

    
        System.out.println("El tiempo promedio de carrera en la semana es: " + tiempoPromedio + " minutos");

        scanner.close();
    }
}