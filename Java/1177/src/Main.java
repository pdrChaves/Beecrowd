import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] n = new int [1000];
        
        int t = sc.nextInt();
        int valor = 0;
        
        for (int i = 0; i < 1000; i++) {
            n[i] = valor;
            System.out.println("N[" + i + "] = " + n[i]);
            valor++;
            if (valor == t) {
                valor = 0;
            }
        }
    }
} 