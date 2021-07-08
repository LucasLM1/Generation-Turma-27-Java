package programas;

import objeto.Objeto_aviao;

public class aviao {

	public static void main(String[] args) {
		
		Objeto_aviao aviao = new Objeto_aviao();
		
		
		aviao.modelo = "Aviâo de manobras";
		aviao.rodas = 3;
		aviao.tipo = "2 pessoas";
		aviao.noar = false;
		aviao.ligado = false;
		aviao.velocidade = 0;
		
		System.out.println("Situação do avião....");
		System.out.println("Velocimentro atual: "+aviao.velocidade+" no ar "+aviao.noar+" ligado "+aviao.ligado);
		System.out.println("Indo pra pista");
		aviao.ligar(); 
		
		aviao.aumentarVelocidade();
		aviao.aumentarVelocidade();
		aviao.aumentarVelocidade();
		aviao.diminuirVelocidade();
		aviao.diminuirVelocidade();
		aviao.diminuirVelocidade();
		
		System.out.println("Velocimentro atual: "+aviao.velocidade+" no ar "+aviao.noar+" ligado "+aviao.ligado);
		aviao.decolando();
		aviao.aumentarVelocidade(40);
		System.out.println("Velocimentro atual: "+aviao.velocidade+" no ar "+aviao.noar+" ligado "+aviao.ligado);
		aviao.diminuirVelocidade(40);
		System.out.println("Velocimentro atual: "+aviao.velocidade+" no ar "+aviao.noar+" ligado "+aviao.ligado);
		aviao.pousar();
		System.out.println("Velocimentro atual: "+aviao.velocidade+" no ar "+aviao.noar+" ligado"+aviao.ligado);
		aviao.desligar();
		System.out.println("Velocimentro atual: "+aviao.velocidade+" no ar "+aviao.noar+" ligado "+aviao.ligado);
	}

}