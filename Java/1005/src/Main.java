import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        float A, B, MEDIA;
        Scanner sc = new Scanner(System.in); 
        A = sc.nextFloat();
        B = sc.nextFloat();
        A = A*3.5f;
        B = B*7.5f;

        MEDIA= (A+B)/11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
}