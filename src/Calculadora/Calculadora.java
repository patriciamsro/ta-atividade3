package Calculadora;

public class Calculadora {

	private double memoria;
	
	public Calculadora() {
	}
	
	public Calculadora(double memoria) {
		this.memoria = memoria;
	}
	
	public double somar(double valor) {
		return this.memoria = memoria + valor;
	}
	
	public void subtrair(double valor) {
		this.memoria = memoria - valor;
	}
	
	public void multiplicar(double valor) {
		this.memoria = memoria * valor;
	}
	
	public void dividir(double valor) {
		this.memoria = memoria / valor;
	}
	
	public double getMemoria() {
		return memoria;
	}
		
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	
	public void zerarMemoria() {
		setMemoria(0);
	}
}
