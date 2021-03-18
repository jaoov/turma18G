package POO;

public class Pessoa 
{
	private String primeiroNome;
	private String ultimoNome;
	private String nomesdoMeio;
	
	public Pessoa(String primeiro, String meio, String ultimo) 
	{
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesdoMeio = meio;
	}
	
	public String getNomeCompleto() 
	{
		String nomeCompleto = primeiroNome+""+nomesdoMeio+""+ultimoNome;
		return nomeCompleto;
	}

}

