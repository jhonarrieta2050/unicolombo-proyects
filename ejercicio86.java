import java.util.Scanner;

public class ejercicio86 {
    
    public static void main(String[] args) {
        int suma=0,voltaje;
        Scanner lectura = new Scanner(System.in);

        for(int i = 0 ; i<5;i++){
            System.out.println("Digite el " + (i+1) + " voltaje");
            voltaje = lectura.nextInt();
            suma+= voltaje;
        }
        double promedio = suma/5;

        if(promedio>= 220){
            System.out.println("ALTO VOLTAJE");
        }else{
            System.out.println("VOLTAJE CORRECTO");
        }
    }
}

