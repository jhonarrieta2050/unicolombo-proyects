import java.util.Scanner;

public class ejercicio68 {
    
    public static void main(String[] args) {
        int suma,axu,sumatotal=0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba un numero postivo");
        int numero = lectura.nextInt();

        for(int e = 1; e <numero; e++){
            suma=1;
            axu=1;
        for(int i = 0;i<e;i++){
            suma += axu * (suma);
            System.out.println(suma);
            axu++;
        }
        sumatotal+=suma;
        System.out.println(sumatotal + "-----");
    }

    System.out.println(sumatotal + "---final---");
}
}
    
