import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double [] vetor= new double[100];
        vetor[0] = x;
        for( int i = 1; i <vetor.length ; i++ ){
                vetor[i] = vetor[i-1]/2;
            }
            for( int j = 0 ; j < vetor.length ; j++ ){
            System.out.printf("N[%d] = %.4f\n",j,vetor[j]);
            }
    
    }
}