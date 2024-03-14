import java.util.Scanner;
public class ejercicio37 {

    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Write the hours ");
        int hours = lectura.nextInt();
        System.out.println("Write the minutes");
        int minutes = lectura.nextInt();

        
        

        if(minutes>=10){

            double rest1 = (hours+1 ) *15.00;
            System.out.println("El cobre es de " + rest1);

        }else{
            double rest1 = hours *15.00;
            System.out.println("El cobre es de " + rest1);
        }

    }
}