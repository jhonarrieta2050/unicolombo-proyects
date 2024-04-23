import java.util.Scanner;

public class ejercicio232 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[], p = 0, n1 = 0, n2 = 0;

        System.out.print("Digite la cantidad de números a ingresar: ");
        num = new int[scanner.nextInt()];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite un número ("+(i + 1) + "/" + num.length + "): ");
            num[i] = scanner.nextInt();

            if (num[i] > 0) {
                p++; 
            }else if (num[i] == 0) {
                n1++;
            }else{
                n2++;
            }
        }

        System.out.println("Positivos: " + p);
        System.out.println("Neutros: " + n1);
        System.out.println("Negativos: " + n2);
    }
}