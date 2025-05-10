import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);
        String nome = sc.nextLine();
        Double SalarioFixo, Vendas, SalarioTotal;
        SalarioFixo = sc.nextDouble();
        Vendas = sc.nextDouble();
        SalarioTotal = SalarioFixo + (Vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n", SalarioTotal);
    }
}