programa
{
	inclua biblioteca Calendario --> c
	
	funcao inicio()
	{
		inteiro diaNascimento, mesNascimento, anoNascimento, idadeAnos, idadeMeses, idadeDias, totalIdade

		escreva("Insira o dia em que você nasceu: ")
		leia(diaNascimento)
		escreva("Insira o mês em que você nasceu: (em formato de número) ")
		leia(mesNascimento)
		escreva("Insira o ano em que você nasceu: ")
		leia(anoNascimento)

		idadeAnos = (c.ano_atual() - anoNascimento) * 365
		idadeMeses = (c.mes_atual() - mesNascimento) * 30
		idadeDias = (c.dia_mes_atual() - diaNascimento)

		totalIdade = idadeAnos + idadeMeses + idadeDias

		escreva("Sua idade em dias é: ",totalIdade) 
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 46; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */