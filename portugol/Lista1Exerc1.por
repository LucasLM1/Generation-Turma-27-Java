programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, res, dias, diasrest

		escreva("Quantos dias você ja viveu? ")
		leia(dias)

		 anos = (dias/365)
		 meses = (dias % 365) / 30
		 diasrest = (dias % 365) % 30

		 escreva("Você já viveu: " + anos + " anos e " + meses + " meses e " + diasrest+ "  dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 302; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */