import java.util.Scanner;

public class ejercicio83 {
    
    public static void main(String[] args) {
        int suma=0,nota;
        Scanner lectura = new Scanner(System.in);

        for(int i = 0 ; i<3;i++){
            System.out.println("Digite la " + (i+1) + " nota");
            nota = lectura.nextInt();
            suma+= nota;
        }
        double promedio = suma/3;

        if(promedio>= 7){
            System.out.println("APROVADO");
        }else{
            System.out.println("DESAPROBADO,SIGUA ESTUDIANDO");
        }
    }
}
