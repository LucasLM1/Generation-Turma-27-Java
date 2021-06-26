programa
{
	
	funcao inicio()
	{
		cadeia n
		inteiro id = 0
		inteiro ttid = 0 

		para(inteiro x=1;x<=3;x++){
			escreva("Digite o nome: ")
			leia(n)
			escreva("Digite a idade: ")
			leia(id)
			//ttid = ttid + id
			ttid +=id
			}
			
			escreva("\n")
			escreva("A média é: ", ((ttid)/3))
			escreva("\n")
	}    
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 244; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */