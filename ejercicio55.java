import java.util.Scanner;

public class ejercicio55 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el numero");
        int nnn =  lectura.nextInt();

        if ((nnn % 2 == 0 || nnn % 3 ==  0 || nnn % 5 == 0 || nnn % 7 == 0) && (nnn != 2 && nnn != 3 && nnn != 5 && nnn != 7)) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}

