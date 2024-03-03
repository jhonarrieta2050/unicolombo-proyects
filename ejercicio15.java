import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite su edad");
        int edad = lectura.nextInt();

        if(edad>18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Ustedes es menor de edad");
        }
    }
}
