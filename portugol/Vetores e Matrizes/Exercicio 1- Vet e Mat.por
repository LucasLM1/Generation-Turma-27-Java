programa
{
	
	funcao inicio()
	{

		//Faça um programa que crie um vetor por leitura com 5 valores 
		//de pontuação de uma atividade e o escreva em seguida.
		//Encontre após a maior pontuação e a apresente.
		
		
		inteiro vetor[5]
		inteiro maiorp = 0

para (inteiro x=0; x<=4; x++){
         escreva("Digite o valor: ")
         leia(vetor[x])
		se(vetor[x] > maiorp){
   		 maiorp = vetor[x]
			}

		}

escreva("O maior valor é: ", maiorp)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 162; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */