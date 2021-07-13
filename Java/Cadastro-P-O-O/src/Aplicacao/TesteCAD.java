package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.Terceiro;

public class TesteCAD {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		List <Funcionario> lista = new ArrayList<>();
		int numero;
		
		System.out.println("Cadastro de Funcionários");
		System.out.println();
		System.out.print("Digite a quantidade de funcionários cadastrados :");
		numero = leia.nextInt();
		
		for (int x=1; x<=numero; x++) {
			
			System.out.println("Funcionario : "+x);
			
			System.out.print("Funcionario terceiro S/N :?");
			char op = leia.next().toUpperCase().charAt(0);
			
			System.out.print("Digite a matricula do funcionario :");
			String matricula = leia.next();
			
			System.out.print("Digite as horas trabalhadas :");
			int horastrabalhadas = leia.nextInt();
			
			System.out.print("Digite o valor por hora trabalhada : R$ ");
			double valorhora = leia.nextDouble();
			
			if (op == 'S') {
				System.out.print("Digite o valor do adicional : R$ ");
				double adicional = leia.nextDouble();
				lista.add(new Terceiro(matricula,horastrabalhadas,valorhora,adicional));
				
			} else if (op=='N'){
				
				lista.add(new Funcionario(matricula,horastrabalhadas,valorhora));
				
			} else {
				System.out.println("Não digitou se era terceiro ou não...");
			}
						
		}
		System.out.println();
		System.out.println("Folha de Pagamento");
		
		for (Funcionario pessoa : lista) {
			System.out.println("Matricula do colaborador : "+pessoa.getMatricula()+" salario R$ : "+pessoa.salario());
		}
		

	}

}