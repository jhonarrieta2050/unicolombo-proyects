import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio76 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        try {
            System.out.println("Escriba un numero entero");
            int numero = lectura.nextInt();
            
            int length = String.valueOf(numero).length();
            System.out.println("El tamano es de " + length);
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, ingrese un número entero válido.");
            lectura.nextLine();
        }
    }
}