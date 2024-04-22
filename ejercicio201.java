import java.util.Scanner;

public class ejercicio201 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Ingrese las tres calificaciones parciales:");
        double calificacion1 = scanner.nextDouble();
        double calificacion2 = scanner.nextDouble();
        double calificacion3 = scanner.nextDouble();
        
        System.out.println("Ingrese la calificación del examen final:");
        double examenFinal = scanner.nextDouble();
        
        System.out.println("Ingrese la calificación del trabajo final:");
        double trabajoFinal = scanner.nextDouble();
        
    
        double promedioParciales = (calificacion1 + calificacion2 + calificacion3) / 3.0;
        

        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
        
    
        System.out.println("La calificación final es: " + calificacionFinal);
        
        scanner.close();
    }
}