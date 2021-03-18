package TESTES;

public class Coordenador extends Pessoa
{
	private String cursoCoordenado;
	public Coordenador (String nome, int matricula, String cursoCoordenador) 
	{
		super(nome, matricula);
		this.cursoCoordenado = cursoCoordenado;
		
	}
	public String getCursoCoordenado() {
		return cursoCoordenado;
	}
	public void setCursoCoordenado(String cursoCoordenado) {
		this.cursoCoordenado = cursoCoordenado;
	}
	
}
