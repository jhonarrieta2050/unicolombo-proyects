import  java.util.Scanner;
public class ejercicio31 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite la base en milimetros ");
        double base = lectura.nextDouble();
        System.out.println("Digite la altura en milimetros");
        double altura = lectura.nextDouble();

        double Metrosbase = base/1000;
        double Metrosaltura = altura/1000;

        double resultadoMetros = Metrosaltura*Metrosbase/2;
        double resultadoCentimetros = resultadoMetros*100;
        double resultadoMilimetros = resultadoCentimetros*100;


        System.out.println("Resultado en metros " + resultadoMetros);
        System.out.println("Resultado en centimetros " + resultadoCentimetros);
        System.out.println("Resultado en milimetros " + resultadoMilimetros);
    }
}
