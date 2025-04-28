import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int qntdLesma = sc.nextInt();
            int velocidadeLesma = sc.nextInt();
        
        if (velocidadeLesma<10) {
            System.out.println("1");
            break;
        }
        if (velocidadeLesma>10 && velocidadeLesma<20) {
            System.out.println("2");
            break;
        }
        else{
            System.out.println("3");
            break;
        }
        
        }
    }
}