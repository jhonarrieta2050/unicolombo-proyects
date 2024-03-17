import java.util.Scanner;

public class ejercicio91 {

    String nombre;
    String apellido;
    int edad;
    int numero;
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digite el nombre");
        String nombre = lectura.next();
        System.out.println("Digite el apellidos");
        String apellido = lectura.next();
        System.out.println("Digite la edad ");
        int edad = lectura.nextInt();
        System.out.println("Digite el numero");
        int numero  = lectura.nextInt();

        ejercicio91 persona = new ejercicio91(nombre,apellido,edad,numero);

        persona.mostrar();
    }

    public ejercicio91(String nombre,String apellido, int edad, int numero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numero = numero;
    }

    public void mostrar(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(numero);
    }
}
