import java.util.Scanner;
public class ejercicio66 {
    
    public static void main(String[] args) {
        int suma=0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba un numero entero positivo");
        int numero = lectura.nextInt();

        for(int i = 1; i<2*numero -1;i+=2){
            System.out.println(suma+=i);
        }

        System.out.println("La suma de los numeros es de " + suma);
    }
}
