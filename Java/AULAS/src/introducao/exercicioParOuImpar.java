package introducao;

import java.util.Scanner;

public class exercicioParOuImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Digite um N�mero inteiro positivo");
		num1 = leia.nextInt();
		
		if(num1<0) {
			System.out.println("S� aceitamos n�meros positivos");
		}
		else if(num1 ==0) {
			System.out.printf("%d � um n�mero neutro", num1);
		}
		else if(num1%2 ==0) {
			System.out.printf("%d � um n�mero par", num1);
		}
		else {
			System.out.printf("%d � um n�mero impar", num1);
		}
	}

}
