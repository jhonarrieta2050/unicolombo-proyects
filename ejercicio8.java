import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el divisor");
        int divisor = lectura.nextInt();
        System.out.println("Digite el dividendo");
        int dividendo = lectura.nextInt();

        int resto = divisor % dividendo;

        System.out.println("El resto de la division es de " + resto);
    }
}
