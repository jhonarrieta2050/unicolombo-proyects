import java.util.Scanner;

public class ejercicio117 {
    
    public static void main(String[] args) {
        int c=0;
        Scanner lectura =  new  Scanner(System.in);

        System.out.println("Hasta que numero desea contar");
        int numero = lectura.nextInt();

        for (int i = numero ; i >=0; i--) {
            
            c++;
            System.out.println(i);
        }

        System.out.println("La cantidad de numero contados fueron " + c);
    }
}
