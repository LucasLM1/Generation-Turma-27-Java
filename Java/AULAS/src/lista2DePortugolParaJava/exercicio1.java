package lista2DePortugolParaJava;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int peso, exc, mlt;
		
		System.out.println("Quantos quilos tem dentro deste saco  de tomate? ");
		peso = entrada.nextInt();
		
		exc = (4*(50-peso));
		mlt = (4*(50-peso)%4);
				
		if(peso<=50);{
			System.out.println("Quilos presentes dentro do saco permitidos!");
		}
		else {
		System.out.println("Quilos presentes dentro do NÃO saco permitidos!");
		}
	}
}
