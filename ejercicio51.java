import java.util.Scanner;
public class ejercicio51 {
    private double base;
    private double altura;


    public ejercicio51(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite la base ");
        double base = lectura.nextDouble();
        System.out.println("Digite la altura");
        double altura = lectura.nextDouble();

        ejercicio51 rectangulo = new ejercicio51(base, altura);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}

