import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        int a,b,c,maiorAB,maior;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        maiorAB = (a+b + Math.abs(a-b))/2;
        maior = (maiorAB + c + Math.abs(maiorAB - c ))/2;
        System.out.printf("%d eh o maior\n", maior);
        }
    }