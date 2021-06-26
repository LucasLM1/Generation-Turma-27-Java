programa
{
	inclua biblioteca Matematica -->mt
	
	funcao inicio()
	{
		inteiro valorDigitado = 0
		inteiro ttsoma = 0 
		real media = 0.0
		real ttvalores = 0.0

		enquanto(valorDigitado>=0){
			escreva("Digite um valor positivo ou negativo para sair: ")
			leia(valorDigitado)
			se(valorDigitado>=0){
				ttsoma += valorDigitado
				ttsoma++
			}
		}
		media = ttsoma / ttvalores

		escreva("\nTotal somatório       : " + ttsoma)
		escreva("\nTotal de numeros lidos: " + ttvalores)
		escreva("\nMédia                 : " +mt.arredondar(media,2))
		escreva("Fim do Programa")
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