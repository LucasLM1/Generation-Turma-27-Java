package Aplicacao;

import Entidades.Funcionario;
import Entidades.Terceiro;

public class TesteCAD {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		Terceiro ter1 = new Terceiro();
		
		System.out.println("Funcionario CLT");
		System.out.println("Matricula: " + func1.getMatricula());
		System.err.println("Salario atual: R$ " + func1.salario());
		
		System.out.println("Funcionario Terceiro");
		System.out.println("Matricula: " + ter1.getMatricula());
		System.err.println("Salario atual: R$ " + ter1.salario());
		
	}

}
