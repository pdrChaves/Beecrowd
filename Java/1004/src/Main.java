import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int A, B, PROD;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        PROD = ( A * B );
        System.out.println("PROD = " + PROD);
    }
}