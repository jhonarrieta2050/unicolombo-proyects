import java.util.Scanner;

public class ejercicio97 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba el consumo");
        int consumo = lectura.nextInt();

        int porcentaje = consumo*80/100;

        if(consumo>porcentaje && consumo<= 10000){

            System.out.println("CONSUMO MEDIO");
        }else{
            System.out.println("ALTO CONSUMO DE ENERGIA");
        }
    }
}
