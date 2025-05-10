import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] N = new int [20];
        for( int i = 0 ; i < N.length ; i++ ){
            N[i] = sc.nextInt();
        }
        for( int i = 0 ; i < N.length/2 ; i++ ){
            int temp = N[i];
            N[i] = N[ 19 - i ];
            N[19 - i] = temp;
        }
        for( int i = 0  ; i<N.length ; i++ ){
            System.out.printf("N[%d] = %d\n", i,N[i]);
        }
    }
}