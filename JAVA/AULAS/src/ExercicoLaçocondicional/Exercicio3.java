package ExercicoLaçocondicional;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String [] args) 
	{
	
		int idade;
		
			Scanner leia = new Scanner (System.in);
			
		System.out.println("Digite sua idade : ");
		idade = leia.nextInt();
		
		if (idade < 10 && idade > 25) 
		{
			System.out.println("Sua idade esta fora do padrão!");
		}
		else if (idade >= 10 && idade <= 14) 
		{
			System.out.println("Infantil de 10 a 14 anos");
		}
		else if (idade >= 15 && idade <= 17) 
		{
			System.out.println("Juvenil de 15 a 17 anos");
		}
		else if (idade >= 18 && idade <= 25) 
		{
			System.out.println("Adulto de 18 a 25 anos");
		}
			
	}

}
