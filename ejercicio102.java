import java.util.Scanner;

public class ejercicio102 {
    
    public static void main(String[] args) {
        
        int horasExtra = 0 ;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba la tarifa por horas");
        int tarifa = lectura.nextInt();

        System.out.println("Escriba las horas trabajadas");
        int horas = lectura.nextInt();

        if(horas >= 40){

            horasExtra = horas - 40;
            
            double tarifaI = tarifa * 40;

            double tarifaExtra = tarifa + (tarifa * 25/100);

            double tarifaTotal = (tarifaExtra * horasExtra) + tarifaI;

            System.out.println(tarifaTotal);
        }else{

            double tarifaTotal = horas * tarifa;

            System.out.println(tarifaTotal);
        }
    }
}
