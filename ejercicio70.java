import java.util.Scanner;

public class ejercicio70 {
    
    public static void main(String[] args) {
        int i=0,suma=1,axu=2;
        boolean pass=true;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Cuantas veces desea hacer la suma y resta " );
        int numero = lectura.nextInt();

            for(int e = 1;e <numero;e++){

                if(pass){
                    suma= suma - axu;
                    pass=false;
                }else{
                    suma= suma + axu;
                    pass=true;
                }
                axu++;
            }

            System.out.println("El resultado es " + (suma));
    }
}
