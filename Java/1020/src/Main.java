import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        sc.close();
            int anos = idade / 365;
            int meses = (idade % 365) / 30;
            int dias = (idade % 365) % 30;
            System.out.printf("%d ano(s)\n", anos);
            System.out.printf("%d mes(es)\n", meses);
            System.out.printf("%d dia(s)\n", dias);
    }
}