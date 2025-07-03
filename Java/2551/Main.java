import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            double recorde = -1;
            for (int dia = 1; dia<=N ; dia++) {
                int duracaoMinutos = sc.nextInt();
                int distanciaKm = sc.nextInt();
                double velocidade = (double)(distanciaKm)/duracaoMinutos;
                if (velocidade > recorde) {
                    System.out.println(dia);
                    recorde = velocidade;
                }
            }
        }
    }
}