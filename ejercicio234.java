import java.util.Scanner;

public class ejercicio234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num, num2 = "", num3 = "";
        char n1, n2;

        System.out.print("Digite un número: ");
        num = scanner.next();

        char numChar[] = new char[num.length()];

        // for (int i = 0; i < (num.length() / 2); i++) {
        //     n1 = num.charAt(i);
        //     n2 = num.charAt(num.length() - (i + 1));

        //     if(i == 0){
        //         num3 = num3.valueOf(n2);
        //         num3 +=  num.substring((i + 1), (num.length() - (i + 1)));
        //         num3 += num3.valueOf(n1);
        //         num2 = num3;
        //     }else if(i == 1){
        //         num3 = num2.substring(1, num2.length());
        //         num3 += num3.valueOf(n2);

        //         if (num.length()/i >= 2) {
        //             num3 += num.substring((i + 1), (num.length() - (i + 1)));
        //         }else if(num.length()/i < 2){
        //             num3 += num.substring((i + 1));
        //         }

        //         num3 += num3.valueOf(n1);
        //         num3 += num2.substring(num.length() - 1);
        //         num2 = num3;
        //     }else{
        //         num3 = num2.substring(0, (i-1));
        //         num3 += num3.valueOf(n2);

        //         if (num.length()/i >= 2) {
        //             num3 += num.substring((i + 1), (num.length() - (i + 1)));
        //         }else if(num.length()/i < 2){
        //             num3 += num.substring((i + 1));
        //         }

        //         num3 += num3.valueOf(n1);
        //         num3 += num2.substring(num.length() - 1);
        //         num2 = num3;
        //     }            
        // }

        for (int i = 0; i < num.length(); i++) {
            numChar[i] = num.charAt(i);
        }

        for (int i = num.length(); i > 0; i--) {
            num2 += num2.valueOf(numChar[(i - 1)]);
        }

        if (num2.equals(num)) {
            System.out.println("El número es capicúo.");
            System.out.println(num2);
        } else {
            System.out.println("El número no es capicúo.");
            System.out.println(num2);
        }
    }
}