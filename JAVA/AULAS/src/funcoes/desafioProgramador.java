package funcoes;

import java.util.Scanner;

public class desafioProgramador 
{
	
	public static void main(String[] args) 
	{
		int contador;

		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		contador = leia.nextInt();
		
		for (int x = 0; x < contador; x++ ) 
		{
			traco();
		}
	}

	
	public static void traco()
	{
		System.out.print("-");
	}
}
