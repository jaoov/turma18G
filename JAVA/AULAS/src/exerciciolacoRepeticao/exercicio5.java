package exerciciolacoRepeticao;

import java.util.Scanner;

public class exercicio5 
{
	public static void main(String[] args) 
	{
		int numero;
		int soma = 0;
		Scanner leia = new Scanner(System.in);
		
		do 
		{
			System.out.println("Digite um numero do seu teclado: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
			
		}while (numero != 0);
			
		System.out.println("A soma dos numero é: "+soma);
	}
}

	