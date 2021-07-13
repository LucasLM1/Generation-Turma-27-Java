package Entidades;

public class Funcionario {
	
	private String matricula;
	protected int horastrabalhadas;
	protected double valorhora;
	
	public Funcionario(String matricula, int horastrabalhadas, double valorhora) {
		super();
		this.matricula = matricula;
		this.horastrabalhadas = horastrabalhadas;
		this.valorhora = valorhora;	
	}
	
	public Funcionario() {
		
	}
	
	// Sobrecarga de construtor
	public Funcionario(String matricula) {
		super();
		this.matricula = matricula;
	}



	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorastrabalhadas() {
		return horastrabalhadas;
	}

	public void setHorastrabalhadas(int horastrabalhadas) {
		this.horastrabalhadas = horastrabalhadas;
	}

	public double getValorhora() {
		return valorhora;
	}

	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}
	public double salario() {
		
		// double valorsalario;
		// valorsalario = this.horastrabalhadas * this.valorhora;
		// return valorsalario;
		
		return this.horastrabalhadas * this.valorhora;
	}
	
	
}