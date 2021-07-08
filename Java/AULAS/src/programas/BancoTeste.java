package programas;

import java.util.Scanner;

import objeto.Conta;

public class BancoTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Conta cliente1 = new Conta(1); //instanciar (criar ou jogar)
		Conta clientevip = new Conta(2,1500.00);
		Conta contaCorrente = new Conta(3);
		Conta especial = new Conta(4,2500.00,10000.00);
		
		//Encapsulamento
		//cliente1.getNumero();
		System.out.printf("Numero da conta", clientevip.getNumero());
		
		cliente1.imprimeExtrato();
		
		
	}

}
