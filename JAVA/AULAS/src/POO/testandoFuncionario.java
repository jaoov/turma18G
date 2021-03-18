package POO;

public class testandoFuncionario 
{
	public static void main(String[] args) 
	{
		funcionario func = new funcionario();
		func.setNome("Antonia");
		func.setSalario(2500);
		
		System.out.println(func.getNome());
		System.out.println(func.getSalario());
	}
}
