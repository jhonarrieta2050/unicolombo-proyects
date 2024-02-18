import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);

    System.out.println("Digite el precio del producto");
    double producto = lectura.nextDouble();
    System.out.println("Digite el iva");
    int iva = lectura.nextInt();

    double division = producto*iva/100;
    double ivaR = producto - division;

    System.out.println("El precio de este producto con iva es de " + ivaR);
}
}
