package AtividadePolimorfismoHeranca;

public class Atividade1Cachorro 
{
	private String nome;
	private int idade;
	private String som;
	private String correr;
	
	public Atividade1Cachorro(String nome, int idade, String som, String correr) {
		super();
		this.setNome("DOGIN FELIZ");
		this.setIdade(10);
		this.setSom("AUAUAU");
		this.setCorrer("CORRE!!");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	
}
