import java.util.Scanner;

public class Exercicio04 {

    public static char verificarNumero(double numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        System.out.println("Resultado: " + verificarNumero(numero));

        sc.close();
    }
}