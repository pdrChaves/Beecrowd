import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double delta = Math.pow(b,2)- 4 * a * c;
        double bhaskara1 = (-b+Math.sqrt(delta)) / (2 * a);
        double bhaskara2 = (-b-Math.sqrt(delta)) / (2 * a);

        if (delta < 0 || a==0) {
            System.out.println("Impossivel calcular");
        }
        else {
            System.out.printf("R1 = %.5f\n",bhaskara1);
            System.out.printf("R2 = %.5f\n",bhaskara2);
        }
    }
}