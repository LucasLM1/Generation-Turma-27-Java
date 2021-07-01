package lista1java;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		short anos, dias, meses, diasrest;
		final short diasdoano = 365;
		final short diasdomes = 30;
		
		
		System.out.println("Quantos dias você já viveu? ");
		dias = leia.nextShort();
		
		anos = (short) (dias/ diasdoano);
		meses = (short) ((short) (dias%diasdoano)/diasdomes);
		diasrest = (short) ((dias%diasdoano)%diasdomes);
		
		System.out.println("Você viveu " + anos+" anos e " + meses +" meses e " + diasrest + " dias");
		
		
	}
	
	
}
