import  java.util.Scanner;
public class ejercicio30 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Write the kilometers ");
        double kilometers = lectura.nextDouble();

        double answer = kilometers * 1000;
        System.out.println("Kilometers to centimiters is " + answer);
    }
}
