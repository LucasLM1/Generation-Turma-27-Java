package lista1java;

import java.util.Scanner;
import java.lang.Math; 

public class exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		short a, b, c, r, s, d;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextShort();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextShort();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextShort();
		
		r = (short) Math.pow(a, b);
		s = (short) Math.pow(b, c);
		d = (short) ((short) (r + s)/2);
		
		System.out.println("O resultado é igual a: " + d);
	}

}
