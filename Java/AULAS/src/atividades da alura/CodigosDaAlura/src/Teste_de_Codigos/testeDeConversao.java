package Teste_de_Codigos;

public class testeDeConversao {

	public static void main(String[] args) {
		
		double salario = 1500.50;
        int valor = (int) salario; //esse (int) meio que for�a o salario a ser inteiro
        System.out.println(valor);
        
        long numgrande = 25000000; //at� 6 casas decimais
        short numpequeno = 2500; // at� 4 casas decimais
        byte b = (byte) 155; // at� 3 casas decimais
        

	}

}
