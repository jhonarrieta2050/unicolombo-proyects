import java.util.Scanner;;
public class ejercicio48 {
    
    public static void main(String[] args) {
        double resultado;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite su primer numero");
        int n1 = lectura.nextInt();
        System.out.println("Digite el segundo numero");
        int n2 = lectura.nextInt();

        resultado = n2 + n1;
        System.out.println("SUMA:" + resultado);
        resultado=0;
        resultado = n2 - n1;
        System.out.println("Resta:" + resultado);
        resultado=0;
        resultado = n2 * n1;
        System.out.println("Multiplicacin:" + resultado);
        resultado=0;
        resultado = n2 / n1;
        System.out.println("Division:" + resultado);
        resultado=0;
        resultado = n2 % n1;
        System.out.println("Modulo:" + resultado);

    }
}
