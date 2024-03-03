import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Dijite la nota de su examen");
        double nota = lectura.nextDouble();

        if(nota>3.0){
            System.out.println("Usted paso el examen");
        }else{
            System.out.println("Usted desaprobo el examen");
        }
    }
}
