package aplicacao;

import java.util.Scanner;

import entidades.ContaEspecial;
import entidades.ContaPoupanca;
import entidades.Contag6;

public class TesteBank {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Contag6 cli1 = new Contag6 (34,"Lucas");
		double valor;
		String nome;
		int numero;
		
		
		/*System.out.println("Digite o nome do cliente: ");
		nome = leia.next();
		System.out.println("Digite o numero da conta: ");
		numero = leia.nextInt();
		*/
		
		ContaPoupanca cp1 = new ContaPoupanca(1,"ED", 25);
		ContaEspecial ce1 = new ContaEspecial(150, "Duda", 5000);
		
		System.out.println("Cliente: " +  cp1.getNomeCliente());
		System.out.println("Saldo atual: " +  cp1.getSaldo());
		System.out.println("Digite o valor do crédito: ");
		valor = leia.nextDouble();
		cp1.credito(valor);
		System.out.println("Saldo atual: " + cp1.getSaldo());
		
		
	}

}
