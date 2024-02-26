import java.util.Scanner;

public class ejercicio43 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el numero 1");
        int n1 = lectura.nextInt();
        System.out.println("Digite el numero 2");
        int n2 = lectura.nextInt();

        if(n1>n2){
            System.out.println("El numero menor es " + n2);
        }else{
            System.out.println("El numero menor es  " + n1);
        }
    }
}
