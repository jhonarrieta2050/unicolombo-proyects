import java.util.Scanner;

public class ejercicio82 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite un numero");
        int numero = lectura.nextInt();

        if(numero>0){
            System.out.println("El numero es positivo");
        }else if(numero == 0){
            System.out.println("El numero es 0");
        }else{
            System.out.println("El numero es negativo");
        }
    }
}
