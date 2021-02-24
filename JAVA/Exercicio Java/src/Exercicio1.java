import java.util.Scanner;

public class Exercicio1 {
		
		public static void main(String[] args)
		{
			int ano;
			int dias;
			int mes;
			int diasF;
			int idadeAnos;
			int idadeMeses;
			int idadeDias;
			
			
			Scanner ler = new Scanner (System.in);
			
			System.out.println("Escreva o ano do seu nascimento: ");
			ano = ler.nextInt();
			System.out.println("Escreva o mes do seu nascimento: ");
			mes = ler.nextInt();
			System.out.println("Escreva o dia do seu nascimento: ");
			dias = ler.nextInt();
			
			idadeAnos = (2021 - ano)*365;
			idadeMeses = (2 - mes)*30;
			idadeDias = (24 - dias); 
			
			diasF = idadeAnos + idadeMeses + idadeDias;
			
			System.out.println(diasF);
			
					
			
					
			
		}
}
