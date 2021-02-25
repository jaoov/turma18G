package ExercicoLaçocondicional;

import java.util.Scanner;

public class Exercicio1 
{
	
	public static void main (String [] args) 
	{
		int numero1;
		int numero2;
		int numero3;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite três numeros");
		System.out.println("Digite numero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite numero: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite numero: ");
		numero3 = leia.nextInt();
	
		
		if (numero1 > numero2 && numero1 > numero3)
		{
			System.out.println("O numero maior é: ");
			
			System.out.println(numero1);
			
		}
		else if (numero2 > numero1 && numero2 > numero3)
		{
			System.out.println("O numero maior é: ");
			
			System.out.println(numero2);
		}
		else
		{
			System.out.println("O numero maior é: ");
			System.out.println(numero3);
		}
		
	}
}
