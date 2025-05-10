import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int horaInicio = sc.nextInt();
        int horaFim = sc.nextInt();
        int resultado;
        sc.close();
        
        if (horaFim==horaInicio){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } 
        else if(horaFim>horaInicio){
            resultado=horaFim-horaInicio;    
            System.out.printf("O JOGO DUROU %d HORA(S)\n",resultado);
            }
            else{
                resultado = 24-horaInicio+horaFim;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",resultado);
            }
        }
    }
