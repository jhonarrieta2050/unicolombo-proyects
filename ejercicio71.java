import java.util.Scanner;

public class ejercicio71 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        int suma=1,e=1,axu=0;
        System.out.println("Cuantas veces desea hacer la secuencia fibonacci");
        int numero = lectura.nextInt();

        for(int i = 0; i<numero;i++){
            axu=suma;
            suma= e + suma;
            e=axu;
            System.out.println(suma);
        }
    }
}
