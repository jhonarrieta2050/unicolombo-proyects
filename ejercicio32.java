import java.util.Scanner;
public class ejercicio32 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el largo en metros ");
        double largo = lectura.nextDouble();
        System.out.println("Digite el ancho en metros");
        double ancho = lectura.nextDouble();

        

        double resultadoMetros = largo * ancho;
        double resultadoCentimetros = resultadoMetros*100;
        double resultadoMilimetros = resultadoCentimetros*100;


        System.out.println("Resultado en metros " + resultadoMetros);
        System.out.println("Resultado en centimetros " + resultadoCentimetros);
        System.out.println("Resultado en milimetros " + resultadoMilimetros);
    }
}
