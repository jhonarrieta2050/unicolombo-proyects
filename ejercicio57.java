import java.util.Scanner;

public class ejercicio57 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Escriba el salario por hora");
        int salario = lectura.nextInt();
        System.out.println("Escriba las horas trabajas");
        int horas = lectura.nextInt();

        System.out.println("Tu salario es de " + salario(salario,horas));

    }

    public static int salario(int salary, int hours){

         int result = salary * hours;

        return result;
}
}
