import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        n1= n1 * 2;
        n2= n2 * 3;
        n3= n3 * 4;
        double media = (n1 + n2 + n3 + n4)/10;
        if (media<5) {
            System.out.printf("Media: %.1f\n", media - 0.00001);
            System.out.printf("Aluno reprovado.\n");
        }
        else if(media>=7){
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno aprovado.\n");
        }
        else{
            System.out.printf("Media: %.1f\n", media);
            System.out.printf("Aluno em exame.\n");
            double exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n",exame);
            double novaMedia = (media + exame)/2;
            if (novaMedia>=5) {
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n",novaMedia);
            }
            else{
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n",novaMedia);
            }
        }
    }
}
