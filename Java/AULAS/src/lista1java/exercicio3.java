package lista1java;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 
		short tempev, hora, min, seg;
		final short segph = 3600;
		final short segpm = 60;
		
		System.out.println("Digite a duração em segundos: ");
		tempev = entrada.nextShort();
		
		hora = (short) (tempev/segph);
		System.out.println("Horas: " + hora);
		
		min = (short) ((short) (tempev%segph)/segpm);
		System.out.println("Minutos: " + min);
		
		seg = (short) ((short) (tempev%segph)%segpm);
		System.out.println("Segundos: " + seg);
	}

}
