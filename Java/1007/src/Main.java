import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        int A, B, C, D, DIF;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        DIF = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + DIF);
    }
}