programa
{
	
	funcao inicio()
	{
		inteiro numero[5], x = 0
		inteiro maiorPontuacao = 0

		para(x=0;x<=4;x++)
		{
			escreva("Valores da pontuação: ")
			leia(numero[x])
		
			
          	se(numero[x] > maiorPontuacao){
              	 maiorPontuacao = numero[x]}
  
		}
        para(inteiro y=0; y<=4; y++)
        {
        escreva("\n",numero[y])    
        }
         escreva("\nO maior valor encontrado é  :",maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */