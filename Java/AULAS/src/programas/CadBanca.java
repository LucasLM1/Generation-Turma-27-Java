package programas;

import java.util.Scanner;

import objeto.Pessoa;

public class CadBanca {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Pessoa cliente1 = new Pessoa();
		
		System.out.println("Digite seu nome: ");
		cliente1.nome = leia.next();
		
		System.out.println("Digite o ano de nascimento: ");
		cliente1.nascimento = leia.nextInt();
		
		if(cliente1.calcularidade()>=18) {
			System.out.println("Pode comprar!");
		}else {
			System.out.println("Conteudo proibido!");
		}

	}

}
