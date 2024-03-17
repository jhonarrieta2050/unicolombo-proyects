import java.util.Scanner;

public class ejercicio85 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite un numero");
        int numero = lectura.nextInt();
        if(numero% 2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
