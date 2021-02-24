import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String [] args) 
	{
		double porcentagem;
		double custoConsumidor;
		double custosFabrica;
		double impostos;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual o custo da Fabrica: ");
		custosFabrica = ler.nextDouble();
		
		//processamento; 
		porcentagem = (28 * custosFabrica)/100;
		impostos= (45 * custosFabrica)/100;
		
		custoConsumidor = custosFabrica + impostos + porcentagem;
		
		System.out.println("O custo consumidor é: ");
		System.out.println(custoConsumidor);
		
		
	}

}
