import java.util.Scanner;

public class ejercicio99 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el año");
        int año = lectura.nextInt();
        if(año%4 == 0 && año%100 == 0 && año%400 == 0){
            System.out.println("Es año bisiteso ");
        }else{
            System.out.println("No es un año bisiesto");
        }
    }
}
