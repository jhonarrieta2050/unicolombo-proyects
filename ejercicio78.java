import java.util.Scanner;

public class ejercicio78 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite el pago ");
        int pago = lectura.nextInt();

        if(pago>10000){
            int resta = pago * 20/100;
            pago = pago -resta;
            System.out.println("Su descuento es de " + resta);
            System.out.println("Total a pagar " + pago);
        }else{
            int resta = pago * 10/100;
            pago = pago -resta;
            System.out.println("Su descuento es de " + resta);
            System.out.println("Total a pagar " + pago);
        }

        
    }
}
