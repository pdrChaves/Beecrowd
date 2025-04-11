import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int a,b,c,maiorAB,maior;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    maiorAB= (a+b+Math.abs(a-b))/2;
    maior = (maiorAB+c+Math.abs(maiorAB-c))/2;
    System.out.println(maior + " eh o maior");
}
}