import java.util.Scanner;
public class ejercicio49 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Write a text");
        String text = lectura.nextLine();

        char ex = text.charAt(0);

        System.out.println("The first letter is " + ex);
    }
}
