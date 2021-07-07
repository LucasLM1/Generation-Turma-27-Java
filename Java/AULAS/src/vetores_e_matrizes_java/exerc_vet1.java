package vetores_e_matrizes_java;

import java.util.Scanner;

public class exerc_vet1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pt[] = new int[5];
		int maiorp = 0, nump;
		
		for(int x=0;x<pt.length;x++) {
			System.out.printf("Digite um valor: ",(x+1),": ");
			nump = leia.nextInt();
			
			if(nump>maiorp) {
				maiorp=nump;
			}
		System.out.printf("O maior valor é: ", maiorp, "\n");
		}
	}

}