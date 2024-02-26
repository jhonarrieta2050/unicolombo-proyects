import java.util.Scanner;

public class ejercicio45 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba la su numero ");
        double numero = lectura.nextDouble();

        double number = Determinador(numero);

        System.out.println(number);
    }

    public static double Determinador(double number){

        if(number == 0){
            return 0;
        }if (number>=1) {
            return 1;
        } else {
            return -1;
        }

    }
}
