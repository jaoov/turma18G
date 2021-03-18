package DEUPAU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		int numero = 0;
		String nomes[] = {"JOÃO","MARIA","PEDRO"};
		
		
		try 
		{
		System.out.println("Digite o numero da posição do vetor [0-2]: ");
		numero = leia.nextInt();
		
		System.out.println("O nome escolhido foi: "+nomes[numero]);
		
		}catch(InputMismatchException erro ) 
		{
				System.out.println("Você digitou uma letra invés de um numero...");
		}
		catch (ArrayIndexOutOfBoundsException erro) 
		{
				System.out.println("Você digitou um numero fora do limite...");
		}
		finally 
		{
			System.out.println("VAI SEMPRE ACONTECER!!!");
		}
	}
}
