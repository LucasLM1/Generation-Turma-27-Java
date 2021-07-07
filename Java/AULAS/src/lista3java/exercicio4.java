package lista3java;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		char sexo; //(1-feminino / 2-masculino / 3-Outros)
		char opcao; // (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int pessCalm = 0;
		int mulNerv = 0;
		int homemAgr = 0;
		int outCalm = 0; 
		int pessNervMais40 = 0;
		int pessCalm18 = 0;
		char op='S';
		final int LIMITE = 150;
		int contador=1;
		String nome;
		
		while ( op=='S' && contador <= LIMITE) {
			System.out.println("Participante "+contador);
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite");
			System.out.print("1-feminino\n2-masculino\n3-Outros : ");
			sexo = leia.next().charAt(0);
			System.out.println("Selecione ");
			System.out.print("1 - pessoa calma\n2 - pessoa nervosa\n3 - pessoa agressiva : ");
			opcao = leia.next().charAt(0);
			
			if (opcao =='1') {
				pessCalm++;
			}
			
			if (sexo=='1' && opcao =='2') {
				mulNerv++;
			}
			
			if (sexo=='2' && opcao =='3') {
				homemAgr++;
			}
			
			if (sexo =='3' && opcao =='1') {
				outCalm++;
			}
			
			if(idade>40 && opcao=='2') {
				pessNervMais40++;
			}
			
			if (idade<18 && opcao=='1') {
				pessCalm18++;
			}
			
			System.out.println("Continua S/N:");
			op = leia.next().toUpperCase().charAt(0);
			//saida do loop
			contador++;
			
		}
		System.out.println("Pessoas calmas : "+pessCalm);
		System.out.println("Mulheres nervorsas : "+mulNerv);
		System.out.println("Homens agressivos : "+homemAgr);
		System.out.println("Outros calmos : "+outCalm);
		System.out.println("Pessoas nervosas mais de 40 anos :"+pessNervMais40);
		System.out.println("Menos de 18 calmos :"+pessCalm18);

		
	}

}