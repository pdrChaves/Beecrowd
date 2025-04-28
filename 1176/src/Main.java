import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtdTestes = sc.nextInt();
        for( int i =0 ; i < qtdTestes ; i ++){
            int N = sc.nextInt();

            if ( N>=0 && N<=60) {
                long a= 0, b=1, c=0;
                if ( N == 0) {
                    c = 0;}
                    else if ( N == 1){
                        c = 1;
                } else{
                    for( int j = 2; j <= N ; j ++ ){ 
                        c = a + b;
                        a = b;
                        b = c;
                    }
                }
                System.out.printf("Fib(%d) = %d\n",N,c);
            }
            
        }
        sc.close();
    }
}
