package ARRAYS;

import java.util.Scanner;

public class tarefa1 
{
		public static void main(String[] args) 
		{
			Scanner leia = new Scanner(System.in);
			int valores[] = new int[5]; 
			int maiorPontuacao = 0;
			
			//matriz e vetor == for;
			
			//for(int x = 0; x <= 4; x++) 
			//{
				//System.out.println();
			//}
			
			for (int x = 0; x<valores.length; x++) 
			{
				System.out.printf("Digite o valor de %d: ", (x+1));
				valores[x] = leia.nextInt();
			}
			for (int y = 0; y<valores.length; y++) 
			{
				System.out.println("O valor de " + (y+1) + " é igual a " + valores[y]);
				System.out.println();
				if (valores[y] > maiorPontuacao) 
				{
					maiorPontuacao = valores[y];
				}
			}
			System.out.println();
			System.out.printf("A maior pontuação é %d", maiorPontuacao);
		
			
			
		}
}
