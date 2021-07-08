package objeto;

public class Pessoa {

	public String nome;
	public char sexo;
	public int nascimento;
	
	//public void mostraridade() {
		//System.out.println(2021 - nascimento);
		//if((2021-nascimento) >=18) {
			//System.out.println("Você é adulto");
		//}else {
			//System.out.println("Você é criança");
		//}
	//}
	public int calcularidade() {
		return 2021 - nascimento;
	}
	
}
