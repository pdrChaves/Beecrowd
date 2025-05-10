import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T1 = sc.nextInt();
        int T2 = sc.nextInt();
        int T3 = sc.nextInt();
        int T4 = sc.nextInt();
        int Somatoria =0;
        while (true) {
            Somatoria=((T1+T2+T3+T4)-3);
            System.out.printf("%d\n",Somatoria);
            break;
        }
        }
    }