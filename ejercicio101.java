import java.util.Scanner;

public class ejercicio101 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba el numero a dividir");
        int numero = lectura.nextInt();

        System.out.println("Escriba el divisor");
        int divisor = lectura.nextInt();

        if(numero % divisor == 0){
            System.out.println("Es divisible");
        }else{
            System.out.println("No es divisible");
        }
    }
}