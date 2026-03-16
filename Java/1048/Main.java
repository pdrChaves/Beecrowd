import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double novoSalario=0;
        double reajuste=0;
        if (salario>=0 && salario<=400) {
            novoSalario = salario * 1.15;
            reajuste= novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 15 %");
        }
        else if (salario>400 && salario<=800) {
            novoSalario = salario * 1.12;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 12 %" );

        }
        else if (salario>800 && salario<=1200) {
            novoSalario = salario * 1.10;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 10 %" );

        }
        else if (salario>1200 && salario<=2000) {
            novoSalario = salario * 1.07;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 7 %" );

        }
        else if (salario>2000) {
            novoSalario = salario * 1.04;
            reajuste = novoSalario - salario;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.println("Em percentual: 4 %" );
        }
        
    }
}