package lista1java;

import java.util.Scanner;
import java.lang.Math;

public class exercicio6 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double d, x1, x2, y1, y2;
		
		System.out.println("Digite o valor de X1");
		x1 = entrada.nextShort();
		System.out.println("Digite o valor de X2");
		x2 = entrada.nextShort();
		System.out.println("Digite o valor de Y1");
		y1 = entrada.nextShort();
		System.out.println("Digite o valor de Y2");
		y2 = entrada.nextShort();
		
		d = (short) Math.sqrt(Math.pow(x2, x1) + Math.pow(y1, y2));
		System.out.printf("O resultado do calculo é:  %.2f", d);
	}

}
