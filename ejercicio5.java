import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
    
        System.out.println("Digite el diagonal mayor");
        double dm = lectura.nextDouble();
        System.out.println("Digite el diagonal menor");
        double dmn = lectura.nextDouble();

        double area = dm * dmn / 2;

        System.out.println("El area del rombo es de " + area);
}

}
