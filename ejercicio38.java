import java.util.Scanner;
public class ejercicio38 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Write your age");
        int age = lectura.nextInt();

        int gramos = age * 8000;
        int manzanas = gramos/4;

        System.out.println("La cantidad de fruta consumida en gramos es de " + gramos);
        System.out.println("La cantidad de manzanas son de " + manzanas);
    }
}
