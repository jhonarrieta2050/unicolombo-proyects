import java.util.Scanner;

public class ejercicio108 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba el numero");
        int numero = lectura.nextInt();

        if( numero % 2 == 0 ){

            System.out.println("El numero es par");
        }else{

            System.out.println("El numero es impar");
        }
    }
}
