import java.util.Scanner;

public class ejercicio64 {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int axu=0;
        System.out.println("Escriba el primer numero postivo(base)");
        int n1 = lectura.nextInt();
        System.out.println("Escriba el segundo numero postivo(exponente)");
        int n2 = lectura.nextInt();
            axu = n1;
        for(int i = 1;i<n2;i++){
            n1= n1* axu;
        }
        System.out.println("El resultado es de: " + n1);
    }
}
