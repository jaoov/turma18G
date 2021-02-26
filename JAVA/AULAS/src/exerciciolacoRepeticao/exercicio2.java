package exerciciolacoRepeticao;

import java.util.Scanner;

public class exercicio2 
{
		public static void main(String[] args) 
		{
			int numero;
			int contaPar = 0;
			int contaImpar = 0;
			Scanner leia = new Scanner (System.in);
			
			for (int x = 0; x <= 10; x++) 
			{
				System.out.println("Digite o numero: ");
				numero = leia.nextInt();
				
				if ((numero %2) == 0) 
				{
					contaPar++;
					
				}
				else 
				{
					contaImpar++;
				}
				
			}
			
			System.out.println("Pares: " +contaPar);
			System.out.println();
			System.out.println("Impares: " + contaImpar);
				
		}
}
