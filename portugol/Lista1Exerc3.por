programa
{
	
	funcao inicio()
	{
		inteiro tempEv, hora, min, seg

		escreva("Escreva o tempo de duração em segundos: ")
		leia(tempEv)
		
		hora = tempEv / 3600 
		escreva("Horas: " + hora + "\n") 

		min = (tempEv % 3600) / 60
		escreva("Minutos: " +min + "\n")

		seg = (tempEv % 3600) % 60
		escreva("Segundos: " +seg + "\n")

		escreva("Finalização do Programa")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */