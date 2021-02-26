package exerciciolacoRepeticao;

import java.util.Scanner;

public class exercicio6 
{
	public static void main(String[] args) 
	{
		int numero;
		double media = 0;
		int x = 0;
		Scanner leia = new Scanner (System.in);
		int soma = 0;
		
		
		do 
		{
			System.out.println("Digite um numero inteiro: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0)
			{
				soma = numero + soma;
				x++;
				media = soma / x;
			}
			
		} while (numero != 0);
		System.out.println("A media dos numeros multiplos por 3 é: "+ media);
			
	}
}
