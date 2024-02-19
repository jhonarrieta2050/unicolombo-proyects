import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);

        int suma=0;
        System.out.println("Digite el numero ");
        double n1 = lectura.nextDouble();
        
        String numero1 = String.valueOf(n1);
        for(int u = 0;u < numero1.length();u++){
            char ultimoN = numero1.charAt(u);
            int nsolo = Character.getNumericValue(ultimoN);
            suma += nsolo;
            

        }
        suma+= 1;
        System.out.println("La suma total es de " + suma);
            

    }
    }

