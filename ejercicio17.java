import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        int n1 = lectura.nextInt();
        System.out.println("Digite el segundo numero");
        int n2 = lectura.nextInt();

        if(n1>n2){
            System.out.println("El numero " + n1 + "es el mayor");
        }else{
            System.out.println("El numero " + n2 + "es el mayor");
        }
    }
}
