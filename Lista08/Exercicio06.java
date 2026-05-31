import java.util.Scanner;

public class Exercicio06 {

    public static int converterHora(int hora24, char[] periodo) {

        if (hora24 == 0) {
            periodo[0] = 'A';
            return 12;
        } else if (hora24 < 12) {
            periodo[0] = 'A';
            return hora24;
        } else if (hora24 == 12) {
            periodo[0] = 'P';
            return 12;
        } else {
            periodo[0] = 'P';
            return hora24 - 12;
        }
    }

    public static void exibirHora(int hora, int minuto, char periodo) {
        System.out.printf("%d:%02d %s%n",
                hora,
                minuto,
                (periodo == 'A' ? "A.M." : "P.M."));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a hora (0 a 23): ");
            int hora24 = sc.nextInt();

            System.out.print("Digite os minutos: ");
            int minuto = sc.nextInt();

            char[] periodo = new char[1];

            int hora12 = converterHora(hora24, periodo);

            exibirHora(hora12, minuto, periodo[0]);

            System.out.print("Deseja converter outra hora? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        sc.close();
    }
}