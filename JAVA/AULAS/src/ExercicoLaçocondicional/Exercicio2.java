package ExercicoLaçocondicional;

import java.util.Scanner;

public class Exercicio2 {
		public static void main(String [] args)
		{
			int numero1;
			int numero2;
			int numero3;
			
			Scanner leia = new Scanner (System.in); 
			
			System.out.println("Digite três numeros");
			
			System.out.println("Primeiro numero: ");
			numero1 = leia.nextInt();
			System.out.println("Segundo numero: ");
			numero2 = leia.nextInt();
			System.out.println("Terceiro numero: ");
			numero3 = leia.nextInt();
			
			if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3) 
			{
				System.out.println(numero1);
				System.out.println(numero2);
				System.out.println(numero3);
			}
			else if (numero2 < numero1 && numero2 < numero3 && numero1 < numero3) 
			{
				System.out.println(numero2);
				System.out.println(numero1);
				System.out.println(numero3);
			}
			else if (numero3 < numero1 && numero3 < numero2 && numero1 < numero2) 
			{
				System.out.println(numero3);
				System.out.println(numero1);
				System.out.println(numero2);
			}
			else if (numero1 < numero2 && numero1 < numero3 && numero3 < numero2) 
			{
				System.out.println(numero1);
				System.out.println(numero3);
				System.out.println(numero2);
			}
			else if (numero2 < numero1 && numero2 < numero3 && numero3 < numero1) 
			{
				System.out.println(numero2);
				System.out.println(numero3);
				System.out.println(numero1);
			}
			else if (numero3 < numero1 && numero3 < numero2 && numero2 < numero1) 
			{
				System.out.println(numero3);
				System.out.println(numero2);
				System.out.println(numero1);
			}
			else if (numero3 == numero1 && numero3 == numero2 && numero1 == numero2) 
			{
				System.out.println("Os numeros devem ser diferentes um do outro!!!");
			}
		}

}
