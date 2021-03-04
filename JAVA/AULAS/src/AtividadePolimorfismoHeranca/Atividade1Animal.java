package AtividadePolimorfismoHeranca;

import java.util.Scanner;

public class Atividade1Animal 
{
	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner (System.in);
		char opcao;
		
		Atividade1Cachorro cachorro = new Atividade1Cachorro("MEL",10,"AUAUAU", "CORRE!!");
		Atividade1Cavalo cavalo = new Atividade1Cavalo("JAIRO",7,"IRRRRUU","CORRE!");
		Atividade1Preguica preguica = new Atividade1Preguica ("Preguiça",4,"...","Sobe!");
		
		System.out.println("Digite 1-Cachorro, 2-Cavalo, 3-Preguiça: ");
		opcao = leia.next().charAt(0);
		
				if (opcao == '1') 
				{
					System.out.println("Nome: "+cachorro.getNome()+", idade: "+cachorro.getIdade()+", som: "+cachorro.getSom()+", Ação "+cachorro.getCorrer());
				}
				else if (opcao == '2') 
				{
					System.out.println("Nome: "+cavalo.getNome()+", idade: "+cavalo.getIdade()+", som: "+cavalo.getSom()+", Ação: "+cavalo.getCorrer());
				}
				else if (opcao == '3')
				{
					System.out.println("Nome: "+preguica.getNome()+", idade: "+preguica.getIdade()+", som: "+preguica.getSom()+", Ação: "+preguica.getSubirArvore());
				}
					

		
		
		
	}
}
