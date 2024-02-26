import java.util.Scanner;
public class ejercicio40 {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite los kilos de oro");
        double oro = lectura.nextDouble();
        System.out.println("Digite el precio por onzas");
        double onzas = lectura.nextDouble();
        oro= oro * 1000;
        double resta = oro/28.3495;

        double resultado = resta * onzas;

        System.out.println("El precio del oro es de " + resultado);
    }
}
