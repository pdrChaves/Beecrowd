import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        //(1) chá branco
        //(2) chá verde
        //(3) chá preto
        //(4) chá de ervas
    
    Scanner sc = new Scanner(System.in);
    int T;
    System.out.println("Escolha o tipo de chá: ");
    System.out.println("1 - Chá branco");
    System.out.println("2 - Chá verde");
    System.out.println("3 - Chá preto");
    System.out.println("4 - Chá de ervas");
    
    T= sc.nextInt();
    switch(T){
        case 1:
        System.out.println("Chá branco");
        break;
        case 2:
        System.out.println("Chá verde");
        break;
        case 3:
        System.out.println("Chá preto");
        break;
        case 4:
        System.out.println("Chá de ervas");
        break;
        default:
        System.out.println("Opção inválida");
        break;
    }

    
    }

}
