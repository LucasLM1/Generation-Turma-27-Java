programa
{
	
	funcao inicio()
	{
		cadeia nomeUser
		real tempFaren , convTemp
		
		escreva("Digite seu nome: ")
		leia(nomeUser)

		escreva("Digite sua temperatura Farenheit: ")
		leia(tempFaren)
		
		convTemp = (tempFaren - 32 ) /1.8

		escreva("O nome do usuário é:", nomeUser, "\n")
		escreva("A temperatura em graus celsius é: ", convTemp)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */