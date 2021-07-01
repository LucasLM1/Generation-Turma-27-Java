programa
{
	
	funcao inicio()
	{
		cadeia carretafura[5] = {"Batman", "Miranha", "Dollynho", "ED", "Pantera Negra"}
		inteiro nump
		
		/*
		escreva("0 - ")
		escreva(carretafura[0])
		escreva("\n1 - ")
		escreva(carretafura[1])
		escreva("\n2 - ")
		escreva(carretafura[2])
		escreva("\n3 - ")
		escreva(carretafura[3])
		escreva("\n4 - ")
		escreva(carretafura[4])
		escreva("\n")
		*/
		para(inteiro x=0; x<5; x++){
			escreva(x+" - " + carretafura[x] + "\n")
			
		}

		escreva("Digite o número do personagem de 0 a 4: ")
		leia(nump)
		
		escreva(carretafura[nump])
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 469; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */