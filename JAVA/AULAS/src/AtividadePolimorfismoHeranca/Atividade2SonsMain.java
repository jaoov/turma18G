package AtividadePolimorfismoHeranca;

public class Atividade2SonsMain 
{
	public static void main(String[] args) 
	{
		Atividade2Sons sons = new Atividade2Sons ("AUAUAU", "IRRUUUU", "...", "MIAUUU");
		
		System.out.println("CACHORRO :"+sons.getCachorro()); 
		System.out.println("CAVALO :"+sons.getCavalo());
		System.out.println("PREGUIÇA :"+sons.getPreguica());
		System.out.println("GATO :"+sons.getGato());
	}
}
