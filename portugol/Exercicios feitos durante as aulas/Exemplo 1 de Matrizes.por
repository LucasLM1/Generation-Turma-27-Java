programa
{
	
	funcao inicio()
	{
		cadeia prediomaia[3][3] //linhas e colunas
		inteiro linha, coluna

		prediomaia[0][0]= "ED,"
		prediomaia[0][1]= "Janaina,"
		prediomaia[0][2]= "Caio,"
		prediomaia[1][0]= "Thay,"
		prediomaia[1][1]= "Valmir,"
		prediomaia[1][2]= "Vick,"
		prediomaia[2][0]= "Gustavo,"
		prediomaia[2][1]= "Augusto,"
		prediomaia[2][2]= "Tia jess,"

		para(inteiro x=0; x<3; x++){
			para(inteiro y=0; y<3; y++){
				escreva(prediomaia[x][y], " ")
			}
			escreva("\n")
		}

		escreva("Digite a linha: ")
		leia(linha)
		escreva("Digite a coluna: ")
		leia(coluna)
		escreva("O morador do Apto. ", linha, "-", coluna, "é", prediomaia[linha][coluna])
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */