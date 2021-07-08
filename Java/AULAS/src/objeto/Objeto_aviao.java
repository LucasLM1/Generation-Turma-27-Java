package objeto;

public class Objeto_aviao {

	public int rodas;
	public String modelo, tipo;
	public boolean noar;
	public int velocidade;
	public boolean ligado;
	
	
	public void ligar() {
		ligado = true;
	}
	public void desligar() {
		ligado = false;
	}	
	public void decolando() {
		for (int x=1; x<=10; x++) {
			aumentarVelocidade();
		}
		noar=true;	
	}
	public void pousar() {
		for (int x=1; x<=10; x++) {
			diminuirVelocidade();
		}	noar=false;	
	}
	public void aumentarVelocidade() {
		velocidade++;
	}
	public void aumentarVelocidade(int acrescimo) {
		velocidade = velocidade + acrescimo;
	}
	public void diminuirVelocidade() {
		velocidade--;
	}
	public void diminuirVelocidade(int decrescimo) {
		velocidade-= decrescimo;
	}
}