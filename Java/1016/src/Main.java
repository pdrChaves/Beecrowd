import java.util.Scanner;
import java.util.Locale;

public class Main
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    int carroX, carroY,tempoH,distanciaKm;
    distanciaKm=sc.nextInt();
    
    tempoH=((distanciaKm*60)/30);
    
    System.out.println(tempoH+" minutos");
	}
}