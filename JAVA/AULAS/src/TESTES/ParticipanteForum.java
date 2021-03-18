package TESTES;

public class ParticipanteForum implements Leitor,Programador 
{
	String pensamento;
	
	public String lendo() 
	{
		return "Forum";
	}
	public void pensando(char[]ideias ) 
	{
		pensamento = new String (ideias);
	}
	public String digitanto() 
	{
		return pensamento;
	}
	private String aprendendo() 
	{
		return "JAVA";
	}
	@Override
	public String digitando() {
		// TODO Auto-generated method stub
		return "JAVA";
	}

}
