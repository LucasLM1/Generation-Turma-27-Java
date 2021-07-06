package lista3java;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, ctp = 0, ctimp = 0;
		
		for(num = 1; num <= 10; num++) {
			System.out.printf("Digite um numero impar ou par: ", num, "\n");
			num = leia.nextInt();
			
				if(num%2 == 0) {
					ctp++;	
				}
				if(num%2 == 1) {
					ctimp++;
				}
		}
		System.out.printf("Os números impares são: ", ctimp);
		System.out.printf("Os números impares são: ", ctp);
	}	
}