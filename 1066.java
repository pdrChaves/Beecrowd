import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0, qtdpares = 0, qtdimpar = 0, qtdPos = 0, qtdNeg = 0;
        
        for (int i = 0; i < 5; i++) {
            entrada = sc.nextInt();
        
            if (entrada % 2 == 0) {
                qtdpares++;
                if (entrada > 0) {
                    qtdPos++;
                }
            } else {
                qtdimpar++;
                if (entrada > 0) { 
                    qtdPos++;
                }
            }
            
            if (entrada < 0) {   
                qtdNeg++;
            }
        }
        System.out.println(qtdpares + " valor(es) par(es)");
        System.out.println(qtdimpar + " valor(es) impar(es)");
        System.out.println(qtdPos + " valor(es) positivo(s)");
        System.out.println(qtdNeg + " valor(es) negativo(s)");
    }
}
