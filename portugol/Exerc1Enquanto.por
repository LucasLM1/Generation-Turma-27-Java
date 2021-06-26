programa
{
	
	funcao inicio()
	{
		inteiro id, contador = 1
		
		escreva("Digite a sua idade: ")
		leia(id)

		enquanto(id<18){
			escreva("Você não tem permissão de acesso! \n")

			escreva("Digite sua idade novamente: \n")
			leia(id)
			contador++
				se(contador>=3) {
					escreva("Desista, você já tentou muitas vezes! \n")
					pare
							 }
					}
					se(contador == 1){
					escreva("Agora você tem acesso!")
								  }
								  senao{
								  	escreva("Vaza fio \n")
								  }
					}
					
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */