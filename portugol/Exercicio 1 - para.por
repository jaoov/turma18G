programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{

	
		real salario = 0.00
		real somatorioSalario = 0.00, somatorioFilhos = 0.00
		inteiro filhos = 0
		real mediaSalario = 0.00, mediaFilhos = 0.00
		real media = 0.00
		const inteiro habitantes = 20
		real maiorSalario = 0.00
		real percentual = 0.00

		para (inteiro x = 1; x<= habitantes; x++)
		{
			escreva("Qual é o seu salario? :")
			leia(salario)
			escreva("Quantos filhos você tem? :")
			leia(filhos) 
			limpa()

			somatorioSalario = salario + somatorioSalario
			somatorioFilhos = somatorioFilhos + filhos

				se (salario>maiorSalario) 
			{
				maiorSalario = salario
			}

				se(salario<=100)
				{
					percentual++
				}

			 
		}
			mediaSalario = somatorioSalario / habitantes
			mediaFilhos = somatorioFilhos / habitantes
			percentual = (percentual/habitantes)*100

			escreva("A media salarial dos habitantes é:", mediaSalario)
			escreva("\n\nA media de filhos dos habitantes é:", mediaFilhos)
			escreva("\n\nO maior salario dos habitantes foi:", maiorSalario)
			escreva("\n\nO percentual de pessoas com salario até R$100 reais é:", percentual)
			

			
			

			

			
			

			

			

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */