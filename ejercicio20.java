import java.util.Scanner;

public class ejercicio20 {
public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite la primera nota");
        int nota1 = lectura.nextInt();
        System.out.println("Digite la segunda nota");
        int nota2 = lectura.nextInt();
        System.out.println("Digite la tercera nota");
        int nota3 = lectura.nextInt();
        System.out.println("Digite la cuarta nota");
        int nota4 = lectura.nextInt();
        System.out.println("Digite la quinta nota");
        int nota5 = lectura.nextInt();
        int suma = nota1+nota2+nota3+nota4+nota5;
        int promedio = suma/5;
        int doble = suma + suma;

        System.out.println("La suma total es de " + suma);
        System.out.println("El promedio es de " + promedio);
        System.out.println("La suma doble es de " + doble);
    }
}
