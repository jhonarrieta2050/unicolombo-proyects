import java.util.Scanner;
public class ejercicio87 {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite la longitud de un lado del triangulo");
        int lado = lectura.nextInt();

        double area = (lado*lado)*Math.sqrt(3)/4;

        if(area>1000){
            System.out.println("DATOS NO VALIDOS");
        }else{
            System.out.println("El area del triangulo equilatero es de " + area);
        }
    }
}
