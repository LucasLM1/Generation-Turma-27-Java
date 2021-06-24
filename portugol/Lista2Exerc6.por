programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("Digite sua idade, apenas números inteiros: ")
		leia(idade)

		se(idade>=5 e idade<=7)
		escreva("Você pertence a categoria Infantil A")

		senao se(idade>=8 e idade<=11)
		escreva("Você pertence a categoria Infantil B")

		senao se(idade>=12 e idade<=13)
		escreva("Você pertence a categoria Juvenil A")

		senao se(idade>=14 e idade<=17)
		escreva("Você pertence a categoria Juvenil B")

		senao se(idade>=18)
		escreva("Você pertence a categoria Adultos")
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 532; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */