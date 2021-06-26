programa 
{
	
	funcao inicio()
	{
		cadeia  time1, time2, time3, time4
		inteiro pontos1 = 0, pontos2 = 0, pontos3 = 0, pontos4 = 0
		caracter resultado = ' '

		escreva("PAULISTINHA DO ED\n")
	
		para(inteiro i = 1; i <= 4; i++){
			
			escreva("RODADA : " + i + "\n")
			escreva("\nCorinthians ganhou perdeu ou empatou? ")
			leia(resultado)
			se(resultado == 'G'){
				pontos1 += 3
			}
			senao se(resultado == 'E'){
				pontos1 += 1
			}
			senao se(resultado == 'P'){
				pontos1 += 0
			}
			
			escreva("Palmeiras ganhou perdeu ou empatou? ")
			leia(resultado)
			se(resultado == 'G'){
				pontos2 += 3
			}
			senao se(resultado == 'E'){
				pontos2 += 1
			}
			senao se(resultado == 'P'){
				pontos2 += 0
			}
			
			escreva("São paulo ganhou perdeu ou empatou? ")
			leia(resultado)
			se(resultado == 'G'){
				pontos3 += 3
			}
			senao se(resultado == 'E'){
				pontos3 += 1
			}
			senao se(resultado == 'P'){
				pontos3 += 0
			}
			
			escreva("Santos ganhou perdeu ou empatou? ")
			leia(resultado)
			se(resultado == 'G'){
				pontos4 += 3
			}
			senao se(resultado == 'E'){
				pontos4 += 1
			}
			senao se(resultado == 'P'){
				pontos4 += 0
			}
		}

		escreva("corinthinas : " + pontos1 + "\n")
		escreva("Palmeiras   : " + pontos2 + "\n")
		escreva("São Paulo   : " + pontos3 + "\n")
		escreva("Santos      : " + pontos4 + "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 159; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */