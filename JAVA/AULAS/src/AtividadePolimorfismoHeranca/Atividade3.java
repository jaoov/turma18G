package AtividadePolimorfismoHeranca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Atividade3 
{
	public static void main(String[] args) 
	{
		Collection<String> nomes = new ArrayList();
		nomes.add("TÊNIS NIKE");
		nomes.add("TÊNIS ADIDAS");
		nomes.add("TÊNIS MIZUNO");
		nomes.add("TÊNIS PUMA");
		
		
		for (String name: nomes) 
		{
			
			System.out.println("Lista de tênis no estoque: "+name);
		}
		Collection<String> nomes2 = Arrays.asList("TÊNIS FILA", "TÊNIS KAPPA");
		nomes.addAll(nomes2);
		
		System.out.println();
		System.out.println("ADICIONAR FILA E KAPPA NO ESTOQUE...");
		System.out.println("Lista de nomes: "+nomes);
		
		System.out.println();
		System.out.println("EXCLUIR DADOS DO ESTOQUE...");
		nomes.clear();
		System.out.println("Lista de nomes: "+nomes);
		
	
	
		if(nomes.isEmpty()) 
		{
			System.out.println("Lista vazia...");
		}
		else 
		{
			System.out.println("Lista de nomes: "+nomes);
		}
		
		
		
	}
}
