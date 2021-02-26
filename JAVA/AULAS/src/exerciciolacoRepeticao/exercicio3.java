package exerciciolacoRepeticao;

import java.util.Scanner;

public class exercicio3 
{
	public static void main(String[] args) 
	{
		int idade = 1;
		int contador21 = 0;
		int contador50 = 0;
		
		Scanner leia = new Scanner (System.in);
		
		while (idade > 0) 
		{
			System.out.println("Insira sua idade: ");
			idade = leia.nextInt();
		
			if (idade < 21) 
			{
				contador21++;
			}
			else if (idade > 50) 
			{
				contador50++;
			}
		}
		System.out.println("A quantidade de pessoas com menos de 21 anos é: ");
		System.out.println(contador21);
		System.out.println();
		System.out.println("A quantidade de pessoas com mais de 50 anos é: ");
		System.out.println(contador50);
		
	}
}

