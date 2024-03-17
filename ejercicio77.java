import java.util.Scanner;

public class ejercicio77 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el capital");
        double capital = lectura.nextDouble();
        System.out.println("Digite el interes anual");
        double interes = lectura.nextDouble();
        System.out.println("Digite el numero de años");
        double años = lectura.nextDouble();

        interes = interes/12;
        años = 12*años;

        double formula = (interes * capital)/(1-Math.pow((1/(1+interes)), años));

        System.out.println("Los pagos mensuales son de " + formula);
        System.out.println("El total a pagar " + formula*años);

    }
}
