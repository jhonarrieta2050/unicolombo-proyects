import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList nums = new ArrayList<>();
        int num, menor, mayor;
        float media = 0;

        System.out.print("Digite un número: ");
        num = scanner.nextInt();

        menor = num;
        mayor = num;

        while (num != 0){
            if (num > mayor) {
                mayor = num;
            } else if(num < menor) {
                menor = num;
            }

            nums.add(num);

            System.out.print("Digite un número: ");
            num = scanner.nextInt();
        }

        for (Object numero : nums) {
            media += (int) numero;
        }

        media /= nums.size();

        System.out.println("Estadísticas: ");
        System.out.println("Número máximo: " + mayor);
        System.out.println("Número mínimo: " + menor);
        System.out.println("Media: " + media);
    }
}