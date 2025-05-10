import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    sc.useLocale(Locale.US);
    float autonomia=12;
    float tempo = sc.nextInt();
    float velocidade = sc.nextInt();
    float S= (velocidade * tempo);
    float gasto = S / autonomia;

    System.out.printf("%.3f\n",gasto);
    }
}