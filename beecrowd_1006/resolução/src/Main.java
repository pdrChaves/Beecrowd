import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Double A, B, C;
        Float MEDIA;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        A = A*2;
        B = B*3;
        C = C*5;
        MEDIA = (float)(((A+B+C)/10));
        System.out.printf("MEDIA = %.1f\n", MEDIA);
    }
}