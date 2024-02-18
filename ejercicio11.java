import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el ancho");
        double ancho = lectura.nextDouble();
        System.out.println("Digite el largo");
        double largo = lectura.nextDouble();

        double area = largo*ancho;

        System.out.println("El area del rectangulo es de " + area);
    }
}
