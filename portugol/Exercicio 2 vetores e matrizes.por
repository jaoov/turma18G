programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
	
		inteiro jogadas
        inteiro valorSorteado
        inteiro maioresPontuacoes = 0
        real media = 0.00
        inteiro soma = 0

       

        escreva("Quantidades de jogadas do dado :")
        leia(jogadas)

        para (inteiro x=1; x<=jogadas; x++)
        {	
            valorSorteado = Util.sorteia(1, 6) // aqui vc usar a função sortea entre 1 a 6
            escreva("\nJogada numero ",x," resultado: ", valorSorteado,"\n")
		soma = valorSorteado + soma

		se (valorSorteado > maioresPontuacoes){
			maioresPontuacoes = valorSorteado
			
		}
        }
        
         escreva("\nAs maiores pontuações foram: ",maioresPontuacoes)
         media = soma / 10
         escreva("\nA media dos valores é: ",media)
	}	
	

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */