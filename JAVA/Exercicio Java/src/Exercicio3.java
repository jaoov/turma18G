import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) 
	{
		int segundoTotal;
		int horas;
		int minutos;
		int segundos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva o tempo do evento em segundos: ");
		segundoTotal = ler.nextInt();
		
		horas = segundoTotal / 3600;
		minutos = (segundoTotal % 3600)% 60;
		segundos = (segundoTotal % 3600)% 60;
		
		System.out.println(horas);
		System.out.println(minutos);
		System.out.println(segundos); 
		
	}

}
