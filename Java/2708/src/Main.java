import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);        
        int jipetotal=0;
        int pessoastotal=0;
        while (true){
            String movimento = sc.next();
            if (movimento.equals("ABEND")) {
                break;
            }
            int pessoas = sc.nextInt();
            if (movimento.equals("SALIDA")) {
                jipetotal+=1;
                pessoastotal+=pessoas;
            } else if(movimento.equals("VUELTA")){
                if (jipetotal > 0 && pessoastotal >= pessoas){
                jipetotal-=1;
                pessoastotal-=pessoas;
                }
            }
        }
        System.out.printf("%d\n",pessoastotal);
        System.out.printf("%d\n",jipetotal);
    }
}