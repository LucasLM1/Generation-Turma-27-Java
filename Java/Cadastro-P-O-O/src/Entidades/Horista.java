package Entidades;

public class Horista  implements Pagamentos{

	private String cpf;
	private double horas;
	private double valorhora;
	
	
	public Horista(String cpf, double horas, double valorHora) {
		super();
		this.cpf = cpf;
		this.horas = horas;
		this.valorhora = valorHora;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorhora;
	}
	public void setValorHora(double valorHora) {
		this.valorhora = valorHora;
	}
	
	public double payextra() {
		
		return horas * valorhora;
	}
	
	public void paysalario() {
		 
	}
	
	public void payhoras() {
		
	}
	
	
	
	
}