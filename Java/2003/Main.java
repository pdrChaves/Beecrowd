import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String horario = sc.nextLine();
            String[] parte = horario.split(":");
            int hora = parseParaInt(parte[0]);
            int minuto = parseParaInt(parte[1]);
            int totalMin = hora * 60 + minuto;
            int onibusHorario = 8*60;
            int atraso = totalMin + 60 - onibusHorario;
            if (atraso < 0) {
                atraso = 0;
            }
            System.out.println("Atraso maximo: "+atraso);
        }
}
    public static int parseParaInt(String str){
        int resultado = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            resultado = resultado *10 + (c-'0');
            
        }
        return resultado;
    }
}
