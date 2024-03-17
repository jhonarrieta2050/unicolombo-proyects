import java.util.Scanner;

public class ejercicio95 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Tamano del vector");
        int n1 = lectura.nextInt();

        double[] vector1 = new double[n1];

        for(int i =0; i < vector1.length;i++){

            vector1[i] = Math.random() * 100;
        }

        for (int i = 0; i < vector1.length; i++) {
            
            
        }
    }
}
