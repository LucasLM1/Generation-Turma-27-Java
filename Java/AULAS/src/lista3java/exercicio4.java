package lista3java;

import java.io.PrintStream;
import java.util.Scanner; 

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		char sexo;
		char option;
		int pesscalm = 0;
		int mulbrava = 0;
		int hombrav = 0;
		int outcalm = 0;
		int pessnervmais40 = 0;
		int pesscalm18 = 0;
		char op='5';
		final int limite = 150;
		int ctd = 1;
		
		while(op == '5' && ctd <= limite){
			System.out.printf("Participante", ctd);
			ctd = leia.next().charAt(0);
			System.out.println("Digite a idade; ");
			idade = leia.next().charAt(0); 
			System.out.println("1- pessoa calma\n2-pessoa nervosa\n3-pessoa agressiva");
			sexo = leia.next().charAt(0);
			System.out.println("\n1- Feminino\n2-Masculino\n3-Outros");
			option= leia.next().charAt(0);
			
			if(option==1) {
				pesscalm++;
			}
			if(sexo=='1' && option== '2' );{
				mulbrava++;
			}
			if(sexo=='2' && option== '3' ) {
				hombrav++;
			}
			if(sexo=='3' && option=='1' ) {
				outcalm++;
			}
			if(idade > 40 && option=='3' ) {
				pessnervmais40++;
			}
			if(idade < 18 && option =='1' ) {
				pesscalm18++;
			}
			System.out.println("Continua S/N");
			op = leia.next().toUpperCase().charAt(0);
			ctd++;
		}
		System.out.printf("Pessoas calmas", pesscalm, "\n");
		System.out.printf("Mulheres Nervosas", mulbrava, "\n");
		System.out.printf("Homens bravos", hombrav, "\n");
		System.out.printf("outros calmos", outcalm, "\n");
		System.out.printf("Pessoas nervosas com mais de 40 anos", pessnervmais40,"\n");
		System.out.printf("Pessoas calmas com menos de 18", pesscalm18, "\n");
	}

}
