import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double Volume, R, Pi;
        R= sc.nextDouble();
        Pi = 3.14159;
        Volume = (4.0/3) * Pi * Math.pow(R, 3);
        System.out.printf("VOLUME = %.3f\n", Volume);
    }
}