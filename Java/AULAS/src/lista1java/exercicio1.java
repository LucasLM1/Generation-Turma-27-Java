package lista1java;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias, idtotal;
		
		System.out.println("Quantos anos voc� ja viveu? ");
		anos = entrada.nextInt();
		
		System.out.println("Quantos meses voc� ja viveu? ");
		meses = entrada.nextInt();
		
		System.out.println("Quantos dias voc� ja viveu? ");
		dias = entrada.nextInt();
		
		idtotal = (anos*365) + (meses*30) + dias;
		System.out.println("Idade em dias �:" + idtotal);
	}

}
