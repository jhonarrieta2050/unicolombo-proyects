import java.util.Scanner;

public class ejercicio104 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba el indice de la raiz");
        int indice = lectura.nextInt();

        System.out.println("Escriba el numero raiz");
        double raiz = lectura.nextDouble();

        double indiceE = 1.0/indice;
        
        double raizZ = Math.pow(raiz, indiceE);

        System.out.println("La raiz es de " + raizZ);

        lectura.close();
    }
}
