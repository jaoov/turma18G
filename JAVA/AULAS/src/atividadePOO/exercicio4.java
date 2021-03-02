package atividadePOO;

import java.util.Scanner;

public class exercicio4 
{
	public double salario;
	public String nome;
	
	public char genero;
	
	Scanner leia = new Scanner (System.in); 

	public void nomezin()
	{
		System.out.println("Digite o nome do funcionario: ");
		nome = leia.next();
	}
	public void salario() 
	{
		System.out.println("Digite o salario do funcionario: ");
		salario = leia.nextDouble();
	}
	public void genero () 
	{
		System.out.println("Digite o genero do funcionario: 'M'- Masculino 'F'- Feminino 'O'- Outros");
		genero = leia.next().toUpperCase().charAt(0);
	}
	public void digitacao() 
	{
		System.out.println("Seu nome é :" +nome);
		System.out.println("Seu salario é de: "+salario);
		System.out.println("Seu genero é: "+genero);
	}
	
}
