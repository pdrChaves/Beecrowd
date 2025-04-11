import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        //(1) chá branco
        //(2) chá verde
        //(3) chá preto
        //(4) chá de ervas
    
    Scanner sc = new Scanner(System.in);
    int Resposta= sc.nextInt();
    int Acertos=0;
    int RespostaA= sc.nextInt();
    int RespostaB= sc.nextInt();
    int RespostaC= sc.nextInt();
    int RespostaD= sc.nextInt();
    int RespostaE= sc.nextInt();

        if (Resposta==RespostaA) {   
            Acertos+=1;
        }
        if (Resposta==RespostaB) {   
            Acertos+=1;
        }
        if (Resposta==RespostaC) {   
            Acertos+=1;
        }
        if (Resposta==RespostaD) {   
            Acertos+=1;
        }
        if (Resposta==RespostaE) {
            Acertos+=1;
        }
            System.out.printf("%d\n",Acertos);
        }
    }    