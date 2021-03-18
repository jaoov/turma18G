package TESTES;

public class PessoaJuridica extends Pessoa1
{
	public PessoaJuridica() 
	{
		
	}
	private long cnpj;
	public long CPF;
	

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() 
	{
		return "Pessoa Juridica: "+super.getNome()+" - cnpj: "+this.getCnpj();
	}
}
