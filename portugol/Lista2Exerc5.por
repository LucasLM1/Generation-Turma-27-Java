programa
{
	
	funcao inicio()
	{
		real indPol

		escreva("Digite o indice de poluição presente: ")
		leia(indPol)

		se(indPol>=0.05 e indPol<=0.25){
		escreva("Poluição presente aceitavel")
		}senao se(indPol>=0.3){
		escreva("Poluição presente elevado. Atividades suspensas! ")
		}senao se(indPol>=0.4){
		escreva("Poluição presente elevado. Atividades suspensas!")
		}senao se(indPol>=0.5){
		escreva("Nivel de poluição maxima atingida. Suspensão obrigatoria de todas as atividades")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */