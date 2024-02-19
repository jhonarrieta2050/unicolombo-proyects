import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el sueldo basico");
        double sueldo = lectura.nextDouble();
        System.out.println("Digite el sueldo de horas extras");
        double sueldoextra = lectura.nextDouble();
        
        double descuentoaprox = sueldo * 20 / 100;
        double descuento = sueldo-descuentoaprox;
        double total= descuento + sueldoextra;

        System.out.println("El sueldo basico es de " + sueldo);
        System.out.println("El sueldo con descuento es de " + descuento);
        System.out.println("El total es de " + total);
    }
}
