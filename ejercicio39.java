import java.util.Scanner;
public class ejercicio39 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Write your born year");
        int year = lectura.nextInt();

        int edad = 2024 - year;

        int days = edad * 365;

        double v = days * 8;

        double answer = v/24;

        System.out.println("Ha dormido " + answer + " dias");
    }
}