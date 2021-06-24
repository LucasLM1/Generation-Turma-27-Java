programa
{
	
	funcao inicio()
	{
		cadeia codFunc
		inteiro numHT = 0
		real exc = 0.00, saltot = 0.00, salexc = 0.00
		const real VHT = 10.00
		const real HEXC = 20.00
		const inteiro LMHT = 50

		escreva("Digite o código do funcionario: ")
		leia(codFunc)
		escreva("Qual a quantidade de horas trabalhadas: ")
		leia(numHT)

		se(numHT <=LMHT){
			saltot = numHT * VHT
		} senao{
			   salexc = (numHT - LMHT)*HEXC
			   saltot = (LMHT* VHT) + salexc
			  }
		 
		escreva("salario excedente: ", salexc, "\n")
		escreva("salario total: ", saltot, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */