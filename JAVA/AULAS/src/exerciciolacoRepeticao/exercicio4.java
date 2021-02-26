package exerciciolacoRepeticao;

import java.util.Scanner;

public class exercicio4 
{
	public static void main(String[] args) 
	{
		int idade;
		char genero;
		int caracteristica;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int contador4 = 0;
		int contador5 = 0;
		int contador6 = 0;
		int x = 1;
		
		Scanner leia = new Scanner (System.in);
		
		while (x <= 150) 
		{
			x++;
			System.out.println("Sua idade: ");
			idade = leia.nextInt();
			System.out.println("Seu genero: M - masculino , F - feminino, O - outros ");
			genero = leia.next().toUpperCase().charAt(0);
			System.out.println("Você é calmo digite 1, Você é nervoso digite 2, Você é agressivo digite 3");
			caracteristica = leia.nextInt();
			
			if (caracteristica == 1)
			{
				contador1++;
			}
			else if (genero == 'F' && caracteristica == 2) 
			{
				contador2++;
			}
			else if (genero == 'M' && caracteristica == 3) 
			{
				contador3++;
			}
			else if (genero == 'O' && caracteristica == 1) 
			{
				contador4++;
			}
			else if (idade > 40 && caracteristica == 2) 
			{
				contador5++;
			}
			else if (idade < 18 && caracteristica == 1) 
			{
				contador6++;
			}
		}
	
		System.out.println("Número de pessoas calmas: "+ contador1);
		System.out.println("Numero de mulheres nervosas: " + contador2);
		System.out.println("Numero de homens agressivos: "+ contador3);
		System.out.println("Numero de outros calmos: " + contador4);
		System.out.println("Numero de pessoas nervosas com mais de 40 anos: " + contador5);
		System.out.println("Numero de pessoas calmas com menos de 18 anos: " + contador6);
		
	}

}
