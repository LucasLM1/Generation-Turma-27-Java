programa
{

    funcao inicio()
    {
        inteiro num = 0
        inteiro ttimp=0
        real cntd=0.00
        real media=0.00
        inteiro mNum=0

        
        faca {
            escreva("Digite o numero positivo inteiro:")
            leia(num)
            se ( ((num%2)==1) e ((num%3)==0) ){
                ttimp += num
                cntd++
                se (num > mNum)
                {

                    mNum = num
                }

            }

        } enquanto (num != 0)

        
        media = ttimp / cntd
        escreva("Media dos numeros impares multiplos de 3 :"+media+"\n")
        escreva("Maior numero digitado foi "+mNum+"\n")
        escreva("FIM DE PROGRAMA")

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */