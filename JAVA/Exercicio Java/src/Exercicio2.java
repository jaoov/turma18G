import java.util.Scanner;

public class Exercicio2 {
		
	public static void main(String [] args) 
	{
		int diasF;
		int ano;
		int meses;
		int dias;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Escreva sua idade em dias: ");
		diasF = ler.nextInt();
		
		//processamento;
		ano = (diasF / 365);
		meses = (diasF % 365)/30;
		dias = (diasF % 365 )%30;
		
		System.out.println(ano);
		System.out.println(meses);
		System.out.println(dias);
		
	}

}
