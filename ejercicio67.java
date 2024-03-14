import java.util.Scanner;

public class ejercicio67 {
    public static void main(String[] args) {
        int suma=1,axu=1;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba un numero postivo");
        int numero = lectura.nextInt();

        for(int i = 1;i<numero;i++){
            suma += axu * (suma);
            System.out.println(suma);
            axu++;
        }
        System.out.println(suma);
    }
}
