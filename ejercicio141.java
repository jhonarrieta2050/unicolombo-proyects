import java.util.Scanner;
public class ejercicio141 {

    
    public static void main(String[] args) {
        int c=0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba un numero para calcular su raiz cuadrada");
        int numero = lectura.nextInt();

        for (int i = 2; i < numero -1; i++) {
            
            if(numero%i == 0){

                c = numero/i;

                if (c*c == numero) {
                    
                    break;
                }
                
            }

        }

        System.out.println("La raiz cuadrada de " + numero + " es " + c);
    }
}
