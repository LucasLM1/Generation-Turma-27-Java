package vetores_e_matrizes_java;

import java.util.Scanner;

public class exerc_vet2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int dado[] = new int[10];
		int numlanc;
		int numpt = 0;
		int somalanc = 0;
		int qtdmaior = 0;
		int maiorp = 0;
		double media = 0.00;
				
				for(int x= 0; x < dado.length; x++) {
					System.out.printf("Digite o valor de cada lançamento: ", dado);
					dado[x] = leia.nextInt();
					
					somalanc += dado[x];
					media = somalanc/dado.length;
					
					if(dado[x] > maiorp) {
						maiorp = dado[x];
					}
				}
				for(int x= 0; x < dado.length; x++);{
					if(maiorp != dado[10]) {
						qtdmaior++;
					}
				}
				System.out.printf("Maior valor: ", maiorp);
				System.out.printf("Média dos valores lançados: ", media);
				System.out.printf("Quantidade total de números repetidos:", qtdmaior);
	}

}
