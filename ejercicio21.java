import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[]args){
        Scanner lectura = new Scanner(System.in);
        String intercambio;

        System.out.println("Digite el valor 1");
        String valor1 = lectura.nextLine();
        System.out.println("Digite el valor 2");
        String valor2 = lectura.nextLine();

        intercambio = valor2;
        valor2 = valor1;
        valor1 = intercambio;

        System.out.println("El valor 1 ahora es de " + valor1);
        System.out.println("El valor 2 ahora es de " + valor2);
    }
}
