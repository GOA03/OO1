package lista1;

public class Calculadora {

	String marca;
	String modelo;
	String tipo;
	int memoriaInterna;
	boolean ligada;
	
	public void ligar() {
		ligada = true;
		System.out.println("Calculadora ligada!\n");
	}
	
	public void desligar() {
		ligada = false;
		System.out.println("Calculadora desligada!\n");
	}
	
	public double somar(double num1, double num2) {
		
		if (ligada) {
			return num1 + num2;
		}else {
			System.out.println("Calculadora desligada");
			return Double.NaN;
		}
	}
	
	public double subtrair(double num1, double num2) {
			
		if (ligada) {
			return num1 - num2;
		}else {
			System.out.println("Calculadora desligada");
			return Double.NaN;
		}
	}
	
	public double multiplicar(double num1, double num2) {
		
		if (ligada) {
			return num1 * num2;
		}else {
			System.out.println("Calculadora desligada");
			return Double.NaN;
		}
	}
	
	public double dividir(double num1, double num2) {
		
		if (ligada) {
			return num1 / num2;
		}else {
			System.out.println("Calculadora desligada");
			return Double.NaN;
		}
	}
	
}
