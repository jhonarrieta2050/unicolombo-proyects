import java.util.Scanner;
public class ejercicio54 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite los cm");
        double cm = lectura.nextDouble();

        System.out.println("pulgadas" + conversion(cm));


    }

    public static double conversion(double cm ){

        double result = cm /2.54;

        return result;
    }
}
