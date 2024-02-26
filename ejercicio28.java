import java.util.Scanner;
public class ejercicio28 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Write the number");
        int number = lectura.nextInt();

        while (number>=0) {
            System.out.println(number);
            number--;
        }
    }
}
