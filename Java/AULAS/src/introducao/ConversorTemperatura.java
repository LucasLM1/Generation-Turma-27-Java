package introducao;

public class ConversorTemperatura {

	public static void main(String[] args) {
		
		String nomeuser = "Lucas";
		double temperatura = 36;
		
		System.out.println("Ol� " + nomeuser);
		temperatura = (temperatura*1.8)+32;
		System.out.println("Em Fahrenheit sua temperatura �: " +temperatura+"F�");
		System.out.println("Em Kelvin: " + (temperatura+ 273.15)+ "K�");
		
	}

}
