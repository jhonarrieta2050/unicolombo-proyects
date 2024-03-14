import java.util.Scanner;
public class ejercicio36 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Write the hours ");
        int hours = lectura.nextInt();
        System.out.println("Write the minutes");
        int minutes = lectura.nextInt();

        double rest1 = hours *15.00;
        double rest = 15.00/60;
        double rest2 = minutes * rest;
        double answer = rest2 + rest1;


        System.out.println(answer);
    }
    
    
}
