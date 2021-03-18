package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadFun 
{
	public static void main(String[] args) 
	{
		/*funcionario colaborador1 = new funcionario("Carlos",1,10,15.25);
		Terceiro colaborador2 = new Terceiro("Joana",45,10,15.25,100);
		
		System.out.println("Salario do"+colaborador1.getNome()+" é R$"+colaborador1.salario());
		System.out.println("Salario do"+colaborador2.getNome()+" é R$"+colaborador2.salario());*/
		
		Scanner leia = new Scanner(System.in);
		List<funcionario> lista = new ArrayList<>();
		
		System.out.println("Digite a quantidade de funcionarios na lista: ");
		int quantidade = leia.nextInt();
		
		for (int x=1;x<=quantidade;x++) 
		{
			System.out.println("Funcionario "+x);
			System.out.println("1 - Funcionario ou 2 - Terceiro");
			char tipo = leia.next().charAt(0);
			System.out.println("Nome: ");
			String nome = leia.next();
			System.out.println("Matricula: ");
			int matricula = leia.nextInt();
			System.out.println("Horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Valor por Hora: ");
			double valorPorHora = leia.nextDouble();
			
			if (tipo == '2') 
			{
				System.out.println("Valor adicional R$:");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(nome, matricula, horasTrabalhadas, valorPorHora, adicional));
			}
			else 
			{
				lista.add(new funcionario (nome, matricula, horasTrabalhadas, valorPorHora));
			}
			
		}
		for (funcionario fun : lista) 
		{
			System.out.println();
			System.out.println("PAGAMENTO DE SALARIOS");
			System.out.println(fun.getNome()+ " seu salario é R$ "+fun.salario());
		}

		
	}
}
	
