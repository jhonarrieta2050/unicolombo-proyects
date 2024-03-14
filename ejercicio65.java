import java.util.Scanner;
public class ejercicio65 {

    public static void main(String[] args) {
        int conteo=0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba hasta donde desea el numero");
        int numero  = lectura.nextInt();

        for(int i = 1;i<=numero;i++){

            conteo+= i;
        }

        System.out.println("La suma de los numeros es de " + conteo);
    }
}
