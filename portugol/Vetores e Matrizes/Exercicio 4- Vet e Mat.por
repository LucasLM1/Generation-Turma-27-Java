programa
{
	
	funcao inicio()
	{
		//Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
		//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		//diagonal, ou seja, diagonal principal.

		inteiro valoruser [3][3]
		inteiro linha, coluna, soma = 0

		para(inteiro x=0; x<3; x++){
			para(inteiro y=0; y<3; y++){
				escreva("Digite o número da matriz: ")
				leia(valoruser[x][y])
			}
			
		}
		
		
		soma= valoruser[0][0] + valoruser[1][1] + valoruser[2][2]
		escreva("Soma dos valores: ", soma, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valoruser, 10, 10, 9}-{coluna, 11, 17, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */