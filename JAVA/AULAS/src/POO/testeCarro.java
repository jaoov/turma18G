package POO;

public class testeCarro 
{
	public static void main(String[] args) 
	{
		carro meuCarro = new carro();
		meuCarro.cor = "vermelho";
		meuCarro.modelo = "Porsche";
		meuCarro.velocidadeAtual=0;
		meuCarro.velocidadeMaxima=200;
		
		meuCarro.liga();
		meuCarro.acelera(120);
		System.out.println(meuCarro.velocidadeAtual);
		meuCarro.pegaMarcha();
	}
}
