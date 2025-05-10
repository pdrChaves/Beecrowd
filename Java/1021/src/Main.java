import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        int[] cedulas = {100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        if (0 <= valor && valor <= 1000000.00) {
            int valorInt = (int) valor;
            int resto = (int) Math.round((valor - valorInt) * 100);

            System.out.println("NOTAS:");
            for (int cedula : cedulas) {
                int quantidade = valorInt / cedula;
                valorInt %= cedula;
                System.out.printf("%d nota(s) de R$ %.2f\n", quantidade, (double) cedula);
            }
            resto += valorInt * 100;

            System.out.println("MOEDAS:");
            for (int moeda : moedas) {
                int quantidadeMoedas = resto / moeda;
                resto %= moeda;
                System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas, moeda / 100.0);
            }
        }
    }
}
