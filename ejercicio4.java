import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){

        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el radio del circulo");
        double radio = lectura.nextDouble();

        double area = 3.14 * (radio*radio);

        System.out.println("El area del circulo es de +" + area);
    }
    
}
