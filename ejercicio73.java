import java.util.Scanner;

public class ejercicio73 {
    
    public static void main(String[] args) {
        int resta;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite su sueldo");
        int sueldo = lectura.nextInt();

        if(sueldo <= 1000) {
            resta = sueldo * 10 / 100;
            sueldo -= resta;
        } else if (sueldo <= 2000) {
            resta = sueldo * 5 / 100;
            sueldo -= resta;
        } else {
            resta = sueldo * 3 / 100;
            sueldo -= resta;
        }
        System.out.println("Cantidad descontada: " + resta);
        System.out.println("Tu sueldo es de: " + sueldo);
    }
}