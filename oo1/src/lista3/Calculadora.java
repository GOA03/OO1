package lista3;

public class Calculadora {
	
	private String marca;
	private String modelo;
	private String tipo;
	private int memoria;
	
	public Calculadora(String marca, String modelo, String tipo, int memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.memoria = memoria;
	}
	
	public double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	public double dividir(double num1, double num2) {
		return num1 / num2;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public int getMemoria() {
		return memoria;
	}
	
	
	
}
