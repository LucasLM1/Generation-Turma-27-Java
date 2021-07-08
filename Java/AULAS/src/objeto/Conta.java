package objeto;

public class Conta{
	  	//atributos
		private int numero;
		private double saldo;
		private double limite;
		
		//construtores
		public Conta(int numero) { // constrtutor, obriga a informar um numero no programa principal
			this.numero = numero;
		}
		public Conta(int numero, double saldo) { 
			this.numero = numero;
			this.saldo = saldo;
		}
		public Conta(int numero, double saldo, double limite) { 
			this.numero = numero;
			this.saldo = saldo;
			this.limite = limite;
		}
		
		//Encapsulamento
		public int getNumero() {
			return numero;
		}
		//public void setNumero(int numero) {
			//this.numero = numero;
		//}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public double getLimite() {
			return limite;
		}
		public void setLimite(double limite) {
			this.limite = limite;
		}
		
		
		public void sacar(double valorSaque){
			if(valorSaque<=0) {
				System.out.println("Impossivel realizar a transação!");
			}
			else if(valorSaque>saldo) {
				System.out.printf("Saldo indisponivel");
			} else {
				saldo = saldo-valorSaque;
			}
		}
		public void depositar(double valorDeposito) {
			saldo = saldo+valorDeposito;
		}
		public void imprimeExtrato() {
			System.out.printf("Conta", numero, " Saldo atual: R$ ", saldo);
		}
}
