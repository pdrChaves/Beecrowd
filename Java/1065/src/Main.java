import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada, pares=0;
        for ( int i =0 ; i<5 ; i++ ) {
            entrada = sc.nextInt();
            if (entrada %2 == 0) {
                pares=pares+1;
            }
        }
            System.out.println(pares+ " valores pares");
	}
}