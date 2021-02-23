programa
{
	
	funcao inicio()
	{
		inteiro numeroUm 
		inteiro numeroDois
		inteiro numeroTres
		inteiro numeroQuatro 
		inteiro qua1, qua2, qua3, qua4 

		escreva("Qual o valor do primeiro numero? :")
		leia(numeroUm)
		escreva("Qual o valor do segundo numero? :")
		leia(numeroDois)
		escreva("Qual o valor do terceiro numero? :")
		leia(numeroTres)
		escreva("Qual o valor do quarto numero? :")
		leia(numeroQuatro)
		limpa()

		//processamento

		qua1 = numeroUm * numeroUm 
		qua2 = numeroDois * numeroDois
		qua3 = numeroTres * numeroTres
		qua4 = numeroQuatro * numeroQuatro

		se(qua3 >= 1000)
		{
			escreva("O quadrado do terceiro numero é:", qua3)
		}
		senao{
			escreva("Numero um:", numeroUm, " e seu quadrado é:", qua1)
			escreva("\nNumero dois:", numeroDois, " e seu quadrado é:", qua2)
			escreva("\nNumero tres:", numeroTres, " e seu quadrado é:", qua3)
			escreva("\nNumero quatro:", numeroQuatro, " e seu quadrado é:", qua4)
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 892; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */