import java.util.Scanner;

public class ejercicio22 {
    
    public static void main(String[]args){
        Scanner lectura = new Scanner(System.in);
        int entero = 0, decimal = 0;

        System.out.println("Digite el numero");
        double numero = lectura.nextDouble();
        String numeronew =  Double.toString(numero);

        int punto = numeronew.indexOf(".");

        if(punto == -1){
            entero = Integer.parseInt(numeronew);
        }else{
            String enteros = numeronew.substring(0, punto);
            String decimales = numeronew.substring( punto + 1);

            entero = Integer.parseInt(enteros);
            decimal = Integer.parseInt(decimales);
        }
        
        System.out.println("La parte entera es de " + entero + " y la decimal es de " + decimal);
    }

}