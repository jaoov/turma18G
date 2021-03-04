package AtividadePolimorfismoHeranca;

public class Atividade1Preguica 
{
	private String nome;
	private int idade;
	private String som;
	private String subirArvore;
	
	public Atividade1Preguica(String nome, int idade, String som, String subirArvore) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.subirArvore = subirArvore;
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

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	
	
}
