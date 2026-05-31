import java.util.Scanner;

public class Exercicio05 {

    public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo do produto: ");
        double custo = sc.nextDouble();

        System.out.print("Digite a taxa de imposto (%): ");
        double taxa = sc.nextDouble();

        double valorFinal = somaImposto(taxa, custo);

        System.out.println("Valor com imposto: R$ " + valorFinal);

        sc.close();
    }
}
