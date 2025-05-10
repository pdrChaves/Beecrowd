import java.util.Scanner;
import java.util.Locale;
public class Main
{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();
		float n5 = sc.nextFloat();
		float n6 = sc.nextFloat();
		float positivos=0;
		if (n1>0){
		    positivos=positivos+1;
		}
		if (n2>0){
		    positivos=positivos+1;
		}
		if (n3>0){
		   positivos=positivos+1;
		}
		if (n4>0){
		   positivos=positivos+1;
		}
		if (n5>0){
		   positivos=positivos+1;
		}
		if (n6>0){
		   positivos=positivos+1;
	}
	System.out.printf("%.0f valores positivos\n",positivos);
}
}