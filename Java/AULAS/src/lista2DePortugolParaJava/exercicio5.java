package lista2DePortugolParaJava;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double indpol;
		
		System.out.println("Digite o indice de poluição presente: ");
		indpol = entrada.nextShort();
		
		if (indpol>= 0.05&&indpol<= 0.25);{
			
		}else if(indpol= 0.3) {
			System.out.printf("Poluição presente elevada. Atividades do 1º Grupo suspensas suspensas!");
		}else if(indpol=0.4) {
			System.out.printf("Poluição presente elevada. Atividades do 2º Grupo suspensas suspensas!");
		}else(indpol>=0.5) {
			System.out.printf("Poluição presente elevada. Atividades de todos os Grupos suspensas suspensas!");
		}
	}
	
}