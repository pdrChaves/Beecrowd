import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        double []opções={40,45,50,20,15};
        double total=0;
        
        int codigo = sc.nextInt();
        int quantidade= sc.nextInt();
        sc.close();

        if (codigo>=1 && codigo<=5 ) {
            total=opções[codigo-1]/10*quantidade;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else{}
    }
}