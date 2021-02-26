package funcoes;

import java.util.Scanner;

public class desafioDois 
{
	public static void main(String[] args) 
	{
		double numero;
		double numeroMaior = 0;
		
		Scanner leia = new Scanner (System.in);
	do 
	{
		System.out.println("Digite um numero: ");
		numero = leia.nextDouble();
		
		if (numero > numeroMaior)
		{
			numeroMaior = numero;
		}
		
	} while (numero >= 0);
		
		System.out.println("O maior numero é " + numeroMaior);
		System.out.println();
		System.out.println("FIM DE PROGRAMA!");
	}
}
