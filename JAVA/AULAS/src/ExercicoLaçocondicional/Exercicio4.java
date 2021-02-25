package ExercicoLaçocondicional;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String [] args) 
	{
		double numero;
		double numeroF = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um numero : ");
		numero = leia.nextInt();
		
		if ((numero % 2) == 1) 
		{
		
			numeroF = numero * numero;
			System.out.println("O numero é impar" );
			System.out.println(numeroF);

		}
		
		else 
		{
			numeroF = Math.sqrt(numero);
			System.out.println("O numero é par" );
			System.out.println(numeroF);
			
		}
	}

}
