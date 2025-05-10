import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    sc.useLocale(Locale.US);
    int Dist;
    double Combust,Consumo;
    Dist = sc.nextInt();
    Combust = sc.nextDouble();
    Consumo = Dist / Combust;

    System.out.printf("%.3f km/l\n", Consumo);
    }
}