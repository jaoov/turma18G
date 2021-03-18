package TESTES;

public class TestePessoa 
{
	public static void main(String[] args) 
	{
		Pessoa jessica = new Pessoa("Jessica",555);
		funcionario pedro = new funcionario("Pedro",222,"TI");
		Pessoa maria = new funcionario("Maria",333,"Informatica");
		Pessoa jose = new Coordenador("Jose",777,"Ciencia da computação");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getNome());

	}

}
