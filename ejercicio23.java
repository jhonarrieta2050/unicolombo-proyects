import java.util.Scanner;

public class ejercicio23 {
    
    public static void main(String[]args){
        Scanner lectura = new Scanner(System.in);
        String intercambio;
        boolean pass=true;
        int op = 4;
        int[] array = new int[3];

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Welcome to the game");
        System.out.println("You have to assert the correct answer in order to win");
        System.out.println("--------------------------------------------------------");
        System.out.println("You will have 4 attent to choose the correct option");
        System.out.println("you need to guess beetween a number from 0 to 9, and then guess it 3 three times");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("You will have sign that indicate if the number is in the range(yellow), if it's true(green) and if false(red)");
        System.out.println("-------------------------------------------------------------------------------------------------------------");


        for(int i =0; i < 3;i++){
            int numero = (int)(Math.random() * 8) + 1;
            array[i] = numero;
        }

        while(pass){
            int[] arrayComparativo = new int[3];
            String[] resultados = new String[3];

            for(int j = 0;j < 3; j++){
                System.out.println("Type the numer " + (j+1) );
                arrayComparativo[j] = lectura.nextInt();
            }

            for(int i = 0; i < 3; i++){
                
                if(array[i] == arrayComparativo[i]){
                    resultados[i] = "Verde";
                }else{
                    for(int h = 0; h < 3; h++){
                        for(int j = 0;j < 3; j++){
                        if (array[h] == arrayComparativo[j] && resultados[j] == null ) {
                            resultados[j] = "Amarillo";
                        
                    }
                }
            }
                if(resultados[i] == null){
                    resultados[i] = "Rojo";
                }
                
            }
        }

            System.out.println("Random numbers: 1:-- (" + array[0] + ")-- 2:-- (" + array[1] + ")  3: -- (" + array[2] + ")");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("El resultado es: 1: " + resultados[0] + "----- 2: " + resultados[1] + "-----  3: " + resultados[2]  );

            if(resultados[0] == "Verde" && resultados[1] == "Verde" && resultados[2] == "Verde"){
                System.out.println("YOU HAVE WIN THE GAME, CONGRATULATIONS");
                pass= false;
            }else{
                op--;
                System.out.println("Number of intents " + op);
                if (op== 0) {
                    System.out.println("Sorry, you lost the game, try again");
                    pass=false;
                }
            }

    }
}
}