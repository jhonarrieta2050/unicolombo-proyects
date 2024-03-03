import java.util.Scanner;

public class ejercicio5a7 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite el numero");
        int numero = lectura.nextInt();

        System.out.println("La suma es de: " + suma(numero));

    }

    public static int suma(int number){

        int result = number + number;

        return result;
    }
}
