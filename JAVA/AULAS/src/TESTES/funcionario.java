package TESTES;

public class funcionario extends Pessoa 
{
	private String departamento;
	
	public funcionario (String nome, int matricula, String departamento) 
	{
		super(nome,matricula);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
