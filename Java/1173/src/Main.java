import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] N = new int [10];
        N[0]= sc.nextInt();
        for( int i = 1 ; i < N.length ; i++){
            N[i] = N[i-1]*2;
        }
        for(int i = 0; i < N.length ; i++){
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
        sc.close();
    }
}