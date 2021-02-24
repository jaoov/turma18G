programa
{
	
	funcao inicio()
	{
		inteiro matriz [3][3]
		inteiro soma = 0 
		inteiro x, y
		inteiro somaDiagonal

		escreva("Digite os valores; ")
		leia(matriz[3][3])

		para(x=0;x<3;x++)
		{
			para(y=0;y<3;y++)
			{

				escreva("Digite os valores; ")
				leia(matriz[x][y])
				soma = soma + matriz[x][y]
			}
		}
			escreva("A soma dos valores: ", soma)
			somaDiagonal = matriz[0][0]+matriz[1][1]+matriz[2][2]
			escreva("\nA soma diagonal principal: ",somaDiagonal)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */