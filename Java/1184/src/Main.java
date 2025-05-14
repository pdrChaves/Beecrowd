import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        char Op = sc.next().toUpperCase().charAt(0);
        double [][]M = new double[12][12];
        double soma = 0;

        for (int i = 0; i<12 ; i++){
            for(int j = 0 ; j<12 ; j++){
                M[i][j]=sc.nextDouble();
                if (i>j){
                    soma+=M[i][j];
                    contador++;
                }
            }
        }
        if (Op == 'S'){
            System.out.printf("%.1f\n",soma);
        } else if (Op == 'M') {
            System.out.printf("%.1f\n",soma/contador);
        }
        }
}
