import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] cedulas = {100,50,20,10,5,2,1};
        int N = sc.nextInt();
        int restante = N;
        if (0 < N && N < 1000000) {
            System.out.printf("%d\n",N);
            for (int cedula : cedulas){
                int qtdCedulas = restante / cedula;
                restante %= cedula;
                System.out.printf("%d nota(s) de R$ %d,00\n", qtdCedulas, cedula);
        }
        }
        else {
            System.out.println("Presention Error");
        }
    } 
}