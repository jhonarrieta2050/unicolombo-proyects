import java.util.Scanner;

public class ejercicio80 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int entero = lectura.nextInt();
        
        System.out.println("Ingrese un numero real:");
        double real = lectura.nextDouble();
        
        System.out.println("Ha ingresado el numero entero: " + entero);
        System.out.println("Ha ingresado el numero real: " + real);
        
    }
}
