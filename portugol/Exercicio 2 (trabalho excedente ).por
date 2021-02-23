programa
{
	
	funcao inicio()
	{
				inteiro codigo
		inteiro numeroHoras
		inteiro excesso 
		inteiro salarioTotal
		inteiro salarioExcedente

		escreva("Quais foram as horas trabalhadas:")
		leia(numeroHoras)

		se(numeroHoras <= 50)
		{
			salarioTotal = numeroHoras * 10
			escreva("O seu salario total foi de:", salarioTotal, " reais")
		}
		senao se(numeroHoras > 50) 
		{
			excesso = numeroHoras - 50 
			salarioTotal = numeroHoras * 10
			salarioExcedente = excesso * 20 

			escreva("O seu salario total foi de:", salarioTotal, "reais e o seu salario excedente foi de:", salarioExcedente, " reais.")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */