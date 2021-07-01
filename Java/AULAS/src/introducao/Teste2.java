package introducao;

public class Teste2 {

	public static void main(String[] args) {
		
		int anonasc = 2002; //%d	
		String nome = "Lucas"; //%s
		char dsexo = 'm'; //%c
		double salario = 1000.555556; //%f
		
		System.out.println(nome + " seu salario é: " + salario);
		System.out.printf("%s Seu salario é: %.2f \n ", nome, salario);
		
		System.out.println("Seu ano de nascimento é: " + anonasc);
	}

}
