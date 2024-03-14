import java.util.Scanner;

public class ejercicio63 {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean i=true;
        int c=0, p;
        while(i){
            System.out.println("Digite un numero");
            int number = lectura.nextInt();
            p=number;
            for(int e=20;e<30;e++){
                if(p==e){
                    i= false;
                }
            }
            if(i){c+= number;}else{break;}
        }

        System.out.println("La suma de los numeros es de " + c);
    }
}
