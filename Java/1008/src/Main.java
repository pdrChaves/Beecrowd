import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main (String[] args){
        int Numer_Func; 
        float Salario, Valor_horas, Horas_Trab;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
       Numer_Func = sc.nextInt();
       Horas_Trab = sc.nextFloat();
       Valor_horas = sc.nextFloat();
       
       Salario = Horas_Trab * Valor_horas;

       System.out.println("NUMBER = " + Numer_Func);
       System.out.printf("SALARY = U$ %.2f\n", Salario);
    }
}