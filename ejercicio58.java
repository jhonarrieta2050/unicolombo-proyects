import java.util.Scanner;

public class ejercicio58 {
    
    public static void main(String[] args) {
        
        Scanner lectura =  new Scanner(System.in);

        System.out.println("Digite un numero del 1 al 10");
        int number = lectura.nextInt();

        multiplicacion(number);
    }

    public static void  multiplicacion(int number){

        for(int i = 0 ; i <= 10; i++){

            System.out.println(number * i);
        }
    }
}
