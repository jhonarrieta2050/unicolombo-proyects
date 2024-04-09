import java.util.Scanner;

public class ejercicio123 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        int suma =0;
        System.out.println("Capital invertido");
        int capital = lectura.nextInt();

        System.out.println("Interes diario");
        int Interes = lectura.nextInt();

        System.out.println("Dias ");
        int dias = lectura.nextInt();

        for (int i = 0; i < dias; i++) {
            
            capital= capital + Interes;
            
            System.out.println("El capital final en el dia " + (i+1) + " es de " + capital );
        }
    }
}
