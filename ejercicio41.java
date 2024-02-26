import java.util.Scanner;

public class ejercicio41 {
    
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        System.out.println("Digit your age");
        int age = lectura.nextInt();

        int answer = 6*age;
        String number1 = Integer.toString(answer);
        String parte = number1.substring(1);
        char numberchar = number1.charAt(0);

        if(age>= 17){
            System.out.println(numberchar+ "." + parte +   "Meters is your hair");
        }else{
            System.out.println("0." + answer + " meters is your hair");
        }
    }
}
