import java.util.Scanner;
public class ejercicio53 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba el lado");
        int lado = lectura.nextInt();

        System.out.println("El area es de " + calculo(lado));


    }

    public static int calculo(int ladoo){

        int result = ladoo * ladoo;

        return result;
    }
}
