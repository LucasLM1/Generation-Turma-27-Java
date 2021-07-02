package lista1java;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		short n1, n2, n3, mp;
		
		System.out.println("Digite o valor da nota: ");
		n1 = entrada.nextShort();
		
		System.out.println("Digite o valor da nota: ");
		n2 = entrada.nextShort();
		
		System.out.println("Digite o valor da nota: ");
		n3 = entrada.nextShort();
		
		mp = (short) ((short) ((n1*2) + (n2*3) + (n3*5))/10);
		System.out.println("A sua Média aritimetica ponderada é: "  +  mp);
	}
}
