package TESTES;

public class PessoaFisica extends Pessoa1
{
	private long CPF;
	
	public PessoaFisica() 
	{
		
	}
	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}
	
	public String getNome() 
	{
		return "Pessoa Fisica: "+super.getNome()+" - CPF: "+this.getCPF();
	}
}
