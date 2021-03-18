package POO;

public class carro 
{
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	
	void liga() 
	{
		System.out.println("O carro esta ligado... ");
	}
	void acelera (double quantidade) 
	{
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	int pegaMarcha() 
	{
		if(this.velocidadeAtual<0) 
		{
			return -1;
		}
		if (this.velocidadeAtual>=0 && this.velocidadeAtual<40) 
		{
			return 1;
		}
		if(this.velocidadeAtual>=40 && this.velocidadeAtual<80) 
		{
			return 2;
		}
		return 3;
	}
}
