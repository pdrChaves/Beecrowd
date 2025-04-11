import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int nSeg = sc.nextInt();
        int conversaoH = nSeg / 3600;
        int conversaoM = nSeg % 3600 / 60;
        int conversaoS = nSeg % 3600 % 60;
        System.out.printf("%d:%1d:%1d\n", conversaoH, conversaoM, conversaoS);
    }
}