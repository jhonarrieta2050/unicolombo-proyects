import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args){

        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el numero");
        double numero = lectura.nextDouble();

        if(numero == 0){
            System.out.println("El numero es  0");
        }
        if(numero> 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
