package atividadePOO;

import java.util.Scanner;

public class exercicio3main 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		exercicio3 televisao = new exercicio3 ();
		
		System.out.println("Digite a cor da televis�o: ");
		televisao.cor = leia.next();
		System.out.println("Digite a marca da televis�o: ");
		televisao.marca = leia.next();
		System.out.println("Digite o numero de polegadas: ");
		televisao.polegadas = leia.nextInt();
		System.out.println("Digite o pre�o da televis�o: ");
		televisao.preco = leia.nextDouble();
		
		televisao.Cor();
		televisao.Marca();
		televisao.Polegadas();
		televisao.Preco();
	}
}
