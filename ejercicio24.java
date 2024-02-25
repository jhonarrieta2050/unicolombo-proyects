import java.util.Scanner;
public class ejercicio24 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digit the inches");
        double inches = lectura.nextDouble();

        double answer = inches * 2.54;

        System.out.println("The inches to centimiter is  " + answer );

    }
}
