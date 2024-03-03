import java.util.Scanner;
import java.util.ArrayList;
public class ejercicio60 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        numeros();
    }

    public static void numeros(){
        Scanner lectura = new Scanner(System.in);
        int i = 0;
        boolean pass =true;
        ArrayList <Integer> numeros = new ArrayList<>();

        while (pass) {
            
            System.out.println("Digite el numero");
            int number = lectura.nextInt();

            numeros.add(number);
            if(number == 0){
                pass = false;
            }
            i++;
        }

        System.out.println("Estos son los numeros");
        for(int e = 0; e< numeros.size() -1; e++ ){
            System.out.println(numeros.get(e));
        }
    }
}
