import java.util.Scanner;
public class ejercicio132 {
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean truee = true;
        cajero caja = new cajero(1000);

        do{


        System.out.println("Eliga una opcion");
        System.out.println("1.Deposito----2.Retiro----3.Salir");
        int op = lectura.nextInt();

        

        switch (op) {
            case 1:
                
                System.out.println("Cantidad a depositar");
                int depositar = lectura.nextInt();

                caja.depositar(depositar);

                break;
        
            case 2:

            System.out.println("Cantidad a retirar");
            int retirar = lectura.nextInt();

            caja.retirar(retirar);
                break;

            case 3:

            System.out.println("Desea terminar?");
            System.out.println("1(yes) o 2(no)");
            int res = lectura.nextInt();

            if(res == 1){

                truee = false;

            }else{
                break;
            }
        }

        }while(truee);
    }



    static class cajero {

        int dinero;

        public cajero(int dinero){

            this.dinero = dinero;
        }

        public  void mostrardinero(){

            System.out.println("El dinero en la cuenta es de " + dinero);
        }

        public void depositar(int money){

            dinero += money;

            System.out.println("se ha depositado " + money);

            mostrardinero();

        }

        public void retirar(int retiro){

            dinero = dinero - retiro;

            System.out.println("Se han retirado" + dinero);

            mostrardinero();
        }
    }
}
