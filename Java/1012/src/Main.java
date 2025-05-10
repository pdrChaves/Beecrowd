import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    sc.useLocale(Locale.US);
    double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
    A=sc.nextDouble();
    B=sc.nextDouble();
    C=sc.nextDouble();

    triangulo = A * C /2.0;
    circulo = pi * Math.pow(C, 2);
    trapezio = (A+B) /2.0 * C;
    quadrado = Math.pow(B,2);
    retangulo = A*B;

    System.out.printf("TRIANGULO: %.3f\n", triangulo);
    System.out.printf("CIRCULO: %.3f\n", circulo);
    System.out.printf("TRAPEZIO: %.3f\n", trapezio);
    System.out.printf("QUADRADO: %.3f\n", quadrado);
    System.out.printf("RETANGULO: %.3f\n", retangulo);
    }
}
