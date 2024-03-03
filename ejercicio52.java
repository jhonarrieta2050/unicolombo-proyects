import java.util.Scanner;
public class ejercicio52 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Write the number");
        int n1 = lectura.nextInt();

        int[] resultado = multiplicador(n1);
        for(int i = 0; i<= resultado.length; i++){

            System.out.println(resultado[i]);
        }

        lectura.close();
    }
    
    public static int[] multiplicador(int n){

        int[] array = new int[10];

        for(int i = 0;i<= 9; i++){

            int result = n * (i+1);
            array[i] = result;
        
        }

        return array;
    }
}
