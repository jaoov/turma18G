package TESTES;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno 
{
	public static void main(String[] args) 
	{
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("Jo�o Vitor", "JAVA", 6.8);
		Aluno b = new Aluno("Bia Souza", "Linux", 7.8);
		Aluno c = new Aluno("Renata almeida", "SO", 8.8);
		Aluno d = new Aluno("Jos� Lucas", "Internet", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	
	}
	
}

