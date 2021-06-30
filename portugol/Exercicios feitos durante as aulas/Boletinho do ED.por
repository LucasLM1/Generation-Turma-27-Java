programa
{
	
	funcao inicio()
	{
	cadeia nomealun[4]
	inteiro notalun[4]
	
	escreva("Boletinho do ED \n")
	
	para(inteiro x=0; x<=3; x++){
		escreva("Qual o nome do Aluno: \n")
		leia(nomealun[x])
		escreva("Nota do Aluno: \n")
		leia(notalun[x])
	}
	limpa()
	para(inteiro x=0; x<=3; x++){
		escreva(nomealun[x], " sua nota é: ", notalun[x], "\n")

		se(notalun[x]<=5){
			escreva("Estude mais! \n")
			
				}
				senao{
					escreva("Você foi aprovade! \n")
				}
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */