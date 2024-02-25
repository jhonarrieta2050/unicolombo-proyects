import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digit the degrees centigrade");
        int degrees = lectura.nextInt();

        double conversion = (degrees * 9)/5 + 32;

        System.out.println("The degrees fahrenheit is " + conversion);
    }
}
