import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] par = new int [5];
        int [] impar = new int [5];
        int entrada;
        int indicePar = 0;
        int indiceImpar = 0;
        for( int i = 0 ;  i < 15; i++){
            entrada = sc.nextInt();
        if (entrada % 2 == 0) {
                par[indicePar] = entrada;
                indicePar++;
                if (indicePar == 5) {
                    for(int j = 0 ; j < 5 ; j++) {
                        System.out.println("par[" +j + "] = " + par[j]);
                    }
                    indicePar=0;
            }
        } else{
            impar[indiceImpar] = entrada;
            indiceImpar++;
            if (indiceImpar==5) {
                for( int j = 0 ; j < 5 ; j++ ){
                    System.out.println("impar["+ j + "] = " +impar[j]);
                }
                indiceImpar=0;
            }
        }
    }
    for( int i = 0 ; i < indiceImpar; i++){
        System.out.println("impar["+ i + "] = " +impar[i]);
        
    }
    for( int i = 0 ; i < indicePar; i++){
        System.out.println("par["+ i + "] = " +par[i]);

    }
}
}