import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        
        for(int i = 1; i<4; i++){
            int c=0;
        System.out.println("Digite el numero " + i);
        double n1 = lectura.nextDouble();
        
        String numero1 = String.valueOf(n1);
        for(int u = 0;u < numero1.length();u++){
            c++;
            
        }
            char ultimoN = numero1.charAt(c-3);
            System.out.println("El ultimo numero es " + ultimoN);
    }
}
}
