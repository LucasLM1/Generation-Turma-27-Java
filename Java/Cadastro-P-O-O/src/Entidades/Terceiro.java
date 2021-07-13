package Entidades;

public class Terceiro extends Funcionario implements Pagamentos{
	
	private double adicional;
	
	public Terceiro() {
		
	}

		public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

		public Terceiro(String matricula, int horastrabalhadas, double valorhora) {
		super(matricula, horastrabalhadas, valorhora);
		
	}

		public Terceiro(String matricula, double adicional) {
			super(matricula);
			this.adicional = adicional;
		}
		
		@Override
		public double salario() {
				
			return (super.getHorastrabalhadas() * super.getValorhora()) + adicional;
		}
		
		// interface
		@Override
		public double payextra() {
			
			return horastrabalhadas * valorhora;
		}

		@Override
		public void paysalario() {	
			
		}

		@Override
		public void payhoras() {
			
		}		
}
