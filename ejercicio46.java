import java.util.Scanner;

public class ejercicio46 {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite las millas");
        double millas = lectura.nextDouble();

        double answer = millas * 1825;

        System.out.println("Los metros son " + answer);
    }
}
