import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a= sc.nextDouble();

        if (a<0 || a>100) {
            System.out.println("Fora de intervalo");
        }
        else{
            if (a==0 || a==25) {
                System.out.printf("Intervalo [0,25]\n");
            }
            if (a>0 && a<25) {
                System.out.printf("Intervalo [0,25]\n");
            }
            if (a>25 && a<=50) {
                System.out.printf("Intervalo (25,50]\n");
            }
            if (a>50 && a<=75) {
                System.out.printf("Intervalo (50,75]\n");
            }

            if (a>75 && a<=100) {
                System.out.printf("Intervalo (75,100]\n");
            }
        }
    }
}