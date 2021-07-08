package objeto;

public class carro {
	
	public String modelo;
	public double valor;
	public int velocidade;
	public String cor;
	public boolean ligado;
	
	
	public void ligarcarro() {
		ligado = true;
		System.out.println("Carro ligando...");
	}public void desligarcarro() {
		if(velocidade == 0) {
			System.out.println("Desligando carro...");
			ligado = false;
		}
		else {
			System.out.println("Desacelerar carro! ");
		}
	}
	public void acelerar() {
		velocidade++;
	}
}
