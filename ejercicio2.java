import java.util.Scanner;

public class ejercicio2 {

    static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Digite un texto");
        String texto = lectura.next();
        System.out.println("Usted escribio " + texto);
    }
}
