package lista2java;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Leia A");
		a = leia.nextInt();
		System.out.println("Leia B");
		b = leia.nextInt();
		System.out.println("Leia B");
		c = leia.nextInt();
		
		if (a == b && b == c) {
			System.out.printf(" %d - %d - %d", a, b, c);
		}
		else if (a >= b && b >= c) {
			System.out.printf("%d - %d - %d", c, b, a);
		}
		else if (a >= b && a >= c && c >= b) {
			System.out.printf("%d - %d - %d", b, c, a);
		}
		else if (b >= a && b >= c && c >= a) {
			System.out.printf("%d - %d - %d", a, c, b);
		}

	}

}
