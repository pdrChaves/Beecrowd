import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[10];
        for( int i=0 ; i < vetor.length ; i++ ){
            vetor[i]= sc.nextInt();
            if (vetor[i]<0 || vetor[i]==0) {
                vetor[i]=1;
            }
            System.out.printf("X[%d] = %d\n",i,vetor[i]);
        }
        sc.close();
    }
}
