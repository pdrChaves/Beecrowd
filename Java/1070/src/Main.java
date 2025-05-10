import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] impares = new int[6];
        int x = sc.nextInt();
        int count = 0;
        while ( count<impares.length){
            if (x % 2 != 0){
                impares[count] = x;
                count++;
            }
            x++;
        }
        for ( int i = 0 ; i < impares.length ; i++){
        System.out.println(impares[i]);
        }
    }
}