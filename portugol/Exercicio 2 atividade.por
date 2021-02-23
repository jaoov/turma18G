programa
{
	
	funcao inicio()
	{
	inteiro diasNascimento 
	inteiro idadeAnos
	inteiro idadeDias
	inteiro idadeMeses

	escreva("Qual sua idade em dias?:")
	leia(diasNascimento) 

	idadeAnos = diasNascimento / 365
	idadeMeses =(diasNascimento % 365) / 30
	idadeDias = (diasNascimento % 365) % 30

	escreva("Sua idade em anos:",idadeAnos)
	escreva("\nSua idade em meses:", idadeMeses)
	escreva("\nSua idade em dias:", idadeDias) 

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 426; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */