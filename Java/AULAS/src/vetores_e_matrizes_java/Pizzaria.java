package vetores_e_matrizes_java;

public class Pizzaria {

	public static void main(String[] args) {
		String [] [] sabor = new String [2][3];
		sabor [0][0] = "margherita";
		sabor [0][1] = "portuguesa";
		sabor [0][2] = "pepperoni";
		
		sabor [1][0] = "mozzarela";
		sabor [1][1] = "calabresa";
		sabor [1][2] = "4 queijos";
		
		for (int i = 0; i < sabor.length; i++) {
			for (int c= 0; c < sabor [1].length; c++) {
				System.out.println(1+ "e" + c + "="+ sabor [1][c] + "\t");
			}
		}

	}

}
