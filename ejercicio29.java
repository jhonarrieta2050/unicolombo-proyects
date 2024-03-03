import java.util.Scanner;
public class ejercicio29 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Write the number");
        float number = lectura.nextFloat();

        float answer = number*number*number;

        System.out.println("The answer is " + answer);
}
}

