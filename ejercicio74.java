import java.util.Scanner;
public class ejercicio74 {
    
    public static void main(String[] args) {
        
        Scanner lectura =  new Scanner(System.in);
        int medio;
        System.out.println("Digite el primer numero");
        int n1 = lectura.nextInt();
        System.out.println("Digite el segundo numero");
        int n2 = lectura.nextInt();
        System.out.println("Digite el tercer numero");
        int n3 = lectura.nextInt();

        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));

        if(n1 != max && n1 != min ){
            medio = n1;
        }else if(n2 != max && n2 != min){
            medio = n2;
        }else{
            medio = n3;
        }

        System.out.println("Mayor: " + max);
        System.out.println(medio);
        System.out.println("Menor: " + min);
    }
}
