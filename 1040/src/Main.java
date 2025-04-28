import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        float N1,N2,N3,N4;
        N1=sc.nextFloat();
        N2=sc.nextFloat();
        N3=sc.nextFloat();
        N4=sc.nextFloat();
        
        float P1= N1*2;
        float P2= N2*3;
        float P3= N3*4;
        float P4= N4*1;
        float media= (N1+N2+N3+N4)/4;
        System.out.printf("Media: %.1f",media);

    }
}
