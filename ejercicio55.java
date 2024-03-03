import java.util.Scanner;;
public class ejercicio55 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite algo");
        String nnn =  lectura.nextLine();

        try{
            int numero = Integer.parseInt(nnn);
            System.out.println("1");
        }catch(NumberFormatException e){
            System.out.println("Digite un numero correcto");
        }
        

    }
}
