import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
    
        System.out.println("Digite el primer numero");
        double n1 = lectura.nextDouble();
        System.out.println("Digite el segundo numero");
        double n2 = lectura.nextDouble();
        System.out.println("Digite el tercer numero");
        double n3 = lectura.nextDouble();

        double media = (n1 + n2 + n3)/3;

        System.out.println("La media aritmetica es de " + media);
}
    
}
