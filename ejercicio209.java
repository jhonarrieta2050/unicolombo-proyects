import java.util.Scanner;

public class ejercicio209 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el número de reprobados:");
        int reprobados = scanner.nextInt();

        System.out.println("Ingrese el número de aprobados:");
        int aprobados = scanner.nextInt();

        System.out.println("Ingrese el número de sobresalientes:");
        int sobresalientes = scanner.nextInt();

    
        int totalEstudiantes = reprobados + aprobados + sobresalientes;

    
        double porcentajeReprobados = (reprobados * 100.0) / totalEstudiantes;
        double porcentajeAprobados = (aprobados * 100.0) / totalEstudiantes;
        double porcentajeSobresalientes = (sobresalientes * 100.0) / totalEstudiantes;

    
        System.out.println("Datos estadísticos de la asignatura:");
        System.out.println("Número total de estudiantes: " + totalEstudiantes);
        System.out.println("Porcentaje de reprobados: " + porcentajeReprobados + "%");
        System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        System.out.println("Porcentaje de sobresalientes: " + porcentajeSobresalientes + "%");

        scanner.close();
    }
}