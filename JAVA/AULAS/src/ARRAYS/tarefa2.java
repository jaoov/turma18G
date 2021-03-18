package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class tarefa2 
{
	public static void main(String[] args) 
	{
		int lancamento[] = new int [10];
		double media = 0.00;
		int maiorPontuacao = 0;
		double soma=0.00;
		int contadorMaiorPontuacao=0;
		Scanner leia = new Scanner (System.in);
		Random numeroDado = new Random();
		
		for(int x = 0; x <lancamento.length; x++)
		{
			//System.out.printf("Digite o resultado do lançamento %d : ",(x+1));
			//lancamento[x] = leia.nextInt();
			//lancamento[x] = (int)Math.random()*6)+1;
			lancamento[x] = numeroDado.nextInt(6)+1;
		
		}
		for (int x = 0; x < lancamento.length; x++) 
		{
			System.out.printf("O valor de %d é %d \n", (x+1), lancamento[x]);
			soma = soma + lancamento[x];
			if(lancamento[x] >= maiorPontuacao) 
			{

				if (lancamento[x] > maiorPontuacao)
				{
					contadorMaiorPontuacao=0;
				}
				maiorPontuacao = lancamento[x];
				 contadorMaiorPontuacao++;
				
			}
		}
		media = soma / lancamento.length;
		System.out.printf("O total de lançamentos digitados é %.0f \n",soma);
		System.out.printf("A media é %.2f", media);
		System.out.printf("\nO maior valor é %d", maiorPontuacao);
		System.out.printf("\nO maior valor aparece %d vezes",contadorMaiorPontuacao);
		
	}
}
