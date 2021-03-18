package AtividadePolimorfismoHeranca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Atividade3 
{
	public static void main(String[] args) 
	{
		Collection<String> nomes = new ArrayList();
		nomes.add("T�NIS NIKE");
		nomes.add("T�NIS ADIDAS");
		nomes.add("T�NIS MIZUNO");
		nomes.add("T�NIS PUMA");
		
		
		for (String name: nomes) 
		{
			
			System.out.println("Lista de t�nis no estoque: "+name);
		}
		Collection<String> nomes2 = Arrays.asList("T�NIS FILA", "T�NIS KAPPA");
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
