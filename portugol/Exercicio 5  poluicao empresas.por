programa
{
	
	funcao inicio()
	{
			real indicePoluicao

		escreva("Qual é o indice de poluição? :")
		leia(indicePoluicao)

		se(indicePoluicao <= 0.25)
		{
			escreva("O indice de poluição esta aceitavel")
		}
		senao se(indicePoluicao == 0.3){
			escreva("O indice de poluição ultrapassou os limites, as atividades do 1° grupo de empresas estão suspensas.")
		}
		senao se(indicePoluicao == 0.4){
			escreva("O indice de poluição ultrapassou os limites, as atividades do 1° e 2° grupo de empresas estao suspensas.")			 
		}
		
		senao se(indicePoluicao == 0.5){
			escreva("O indice de poluição ultrapassou totalmente os limites, todos os grupos devem paralisar as atividades!")
		}
		senao se(indicePoluicao > 0.25 ou indicePoluicao < 0.3){
			escreva("O indice de poluição não esta aceitavel, porem não havera mudança nas atividades das empresas.")
		}
		senao se (indicePoluicao > 0.5){
			escreva("PARA TUDO!!!")
		}
	
			

			
		  	
	
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 929; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */