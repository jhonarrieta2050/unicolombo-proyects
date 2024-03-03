import java.util.Scanner;
public class ejercicio50 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Write the first number");
        double n1 = lectura.nextDouble();
        System.out.println("write the second number");
        double n2 = lectura.nextDouble();

        double suma = n2 + n1;
        double Multiplicacin =  n2 * n1;

        System.out.println("addition is: " + suma);
        System.out.println("Multiplication is " + Multiplicacin);

    }
    
}
