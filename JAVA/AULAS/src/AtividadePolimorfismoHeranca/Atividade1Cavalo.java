package AtividadePolimorfismoHeranca;

public class Atividade1Cavalo extends Atividade1Cachorro
{

	public Atividade1Cavalo(String nome, int idade, String som, String correr) 
	{
		super(nome, idade, som, correr);
		this.setNome("Jairo");
		this.setIdade(10);
		this.setSom("IRRUUU");
		this.setCorrer("CORREE!");
	}
		
	
	
}
