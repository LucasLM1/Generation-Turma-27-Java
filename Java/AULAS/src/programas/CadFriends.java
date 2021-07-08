package programas;

import java.util.Scanner;

import objeto.Pessoa;

public class CadFriends {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Pessoa amg = new Pessoa();
		Pessoa amg2 = new Pessoa();
		int idadeteste;
		
		System.out.println("Digite o nome: ");
		amg.nome = leia.next();
		
		System.out.println("Digite seu genero M/F/O: ");
		amg.sexo = leia.next().charAt(0);
		
		System.out.println("Digite seu nascimento: ");
		amg.nascimento = leia.nextInt();
		
		System.out.printf("Idade: ", (2021-amg.nascimento));
		
		
		System.out.println("Amigo 2");
		System.out.println("Digite o nome: ");
		amg2.nome = leia.next();
		amg2.nascimento = 2000;
		idadeteste = amg2.calcularidade();
		
		System.out.printf(amg.nome, " sua idade é ", amg.calcularidade());
		System.out.printf(amg2.nome, " sua idade é ",idadeteste);
		
		/*System.out.printf("Meus amigos são %s e %s", amg.nome.toUpperCase(), amg2.nome.toUpperCase());
		
		if((2021-amg.nascimento) < (2021-amg2.nascimento)) {
			System.out.println("%s é mais velho que %s \n");
		}else if((2021-amg.nascimento) < (2021-amg.nascimento)) {
			
		}
		else {
			System.out.println("Eles tem  a mesma idade!");
		}*/
	}

}
