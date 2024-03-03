import java.util.Scanner;
public class ejercicio56a {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite los segundos");
        double segundos = lectura.nextDouble();

        calculador(segundos);


    }
    
    public static void calculador(double segundos){
        int i = 0;
        boolean pass= true;
        double resultado = segundos/60;
        String valorstring = String.valueOf(resultado);

        int punto = valorstring.indexOf(".");

        valorstring.substring(punto);
        System.out.println(valorstring);
        System.out.println(resultado);
    }
}
