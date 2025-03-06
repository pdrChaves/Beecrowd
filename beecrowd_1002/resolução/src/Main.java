import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main (String[] args){
    double raio, area=0, n=3.14159;
    Scanner sc = new Scanner(System.in);
    raio = sc.nextDouble();
    area = n * Math.pow(raio, 2);

    System.out.printf("A=%.4f\n", area);
    }
}
