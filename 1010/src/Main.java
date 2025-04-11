import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);
        float CP1, NP1, VP1, CP2, NP2, VP2;
        double total;
        CP1 = sc.nextFloat();
        NP1 = sc.nextFloat();
        VP1 = sc.nextFloat();
        CP2 = sc.nextFloat();
        NP2 = sc.nextFloat();
        VP2 = sc.nextFloat();
        total = (NP1 * VP1) + (NP2 * VP2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}