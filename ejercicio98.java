import java.util.Scanner;

public class ejercicio98 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el primer numero");
        double n1 = lectura.nextDouble();

        System.out.println("Digite el segundo numero ");
        double n2 = lectura.nextDouble();

        double suma = n1+n2;
        double resta = n1-n2;
        
        if(suma % resta == 0){
            System.out.println("Es exacto");
        }else{
            System.out.println("No es exacto");
        }
    }
}
