package introducao;

import java.util.Scanner;

public class exercicioParOuImpar {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Digite um Número inteiro positivo");
		num1 = leia.nextInt();
		
		if(num1<0) {
			System.out.println("Só aceitamos números positivos");
		}
		else if(num1 ==0) {
			System.out.printf("%d é um número neutro", num1);
		}
		else if(num1%2 ==0) {
			System.out.printf("%d é um número par", num1);
		}
		else {
			System.out.printf("%d é um número impar", num1);
		}
	}

}
