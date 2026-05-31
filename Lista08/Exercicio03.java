import java.util.Scanner;

public class Exercicio03 {

    public static double soma(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double b = sc.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double c = sc.nextDouble();

        System.out.println("Soma = " + soma(a, b, c));

        sc.close();
    }
}
