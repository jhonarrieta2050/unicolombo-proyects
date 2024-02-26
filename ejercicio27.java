import java.util.Scanner;
public class ejercicio27 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Write your name");
        String name = lectura.nextLine();
        System.out.println("You are: 1.Male --- 2.Female --- 3.Other");
        int op = lectura.nextInt();

        switch (op) {
            case 1:
                System.out.println("Bienvenido " + name);
                break;
            case 2:
            System.out.println("Bienvenida " + name);

            case 3 :
                System.out.println("hola indeciso");
            default:
                break;
        }
}
}