import java.util.Scanner;
public class ejercicio26 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digit the first catet");
        double catet1 = lectura.nextDouble();
        System.out.println("Digit the second catet");
        double catet2 = lectura.nextDouble();

        double answer = catet1 + catet1;

        System.out.println("the square of the hypotenuse is " + answer);
    }
}
