programa
{
	
	funcao inicio()
	{
		inteiro peso, exc, mlt

		escreva("Quantos quilos tem dentro deste saco de tomate? ")
		leia(peso)

		exc = (4*(50-peso))
		mlt = (4*(50-peso)%4)

		se (peso<=50)
		{
			escreva("Quilos de tomate presentes dentro do saco permitidos!")
		}senao{
			escreva("Quilos de tomate presentes dentro do não saco permitidos!")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */