package TESTES;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapaAluno 
{
	public static void main(String[] args) {
		
	
	Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
	
	Aluno a = new Aluno("Jo�o Vitor", "JAVA", 6.8);
	Aluno b = new Aluno("Bia Souza", "Linux", 7.8);
	Aluno c = new Aluno("Renata almeida", "SO", 8.8);
	Aluno d = new Aluno("Jos� Lucas", "Internet", 5.5);
	
	mapa.put("Jo�o vitor", a);
	mapa.put("Bia Souza", b);
	mapa.put("Renata almeida", c);
	mapa.put("Jos� Lucas", d);
	
	System.out.println(mapa);
	System.out.println(mapa.get("Renata almeida"));
	
	Collection<Aluno> alunos = mapa.values();
	
	for (Aluno e:alunos) 
	{
		System.out.println(e);
	}
	}
}
