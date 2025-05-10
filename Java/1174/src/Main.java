import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double [] A = new double [100];
		
		for ( int i=0; i<A.length; i++ ) {
	        A[i]=sc.nextDouble();
		}
		for( int i=0 ; i < A.length; i++ ){
		    if (A[i]<10 || A[i]==10){
		        System.out.printf("A[%d] = %.1f\n",i,A[i]);
		    }
		    
		}
		
	}
}