package aula04;

public class Carro {
	
// = = = = = = = = = = = = Atributos da classe = = = = = = = = = = = =
	
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	int velocidade = 0;
	final int VELOCIDADE_MAX = 200;
	
// = = = = = = = = = = = = Métodos da classe = = = = = = = = = = = =
	
	public void ligar() {
		
		if(ligado) {
			System.out.println(modelo + " já está ligado!");
		} else {
			ligado = true;
			System.out.println(modelo + " ligado!");
		}
		
	}
	
	public void desligar() {
		
		if(ligado && velocidade == 0) {
			ligado = false;
			System.out.println(modelo + " desligado!");
		} else if(velocidade != 0){
			System.out.println(modelo + " está em movimento não podendo ser desligado!");
		} else {
			System.out.println(modelo + " já esta desligado!");
		}
		
	}
	
	public void acelerar() {
		
		if(ligado && velocidade < VELOCIDADE_MAX) {
			velocidade += 10;
			System.out.println(modelo + " acelerou e agora está a " + velocidade + "km/h");
		} else if (velocidade >= VELOCIDADE_MAX){
			System.out.println("Você não pode ultrapassar de 200km/h");
		} else {
			System.out.println(modelo + " está desligado!");
		}
	}
	
	public void frear() {
		
		if(ligado && velocidade > 0) {
			velocidade -= 10;
			System.out.println(modelo + " desacelerou e agora está a " + velocidade + "km/h");
		} else if (!ligado) {
			System.out.println(modelo + " está desligado!");
		} else {
			System.out.println(modelo + " está parado");
		}
	}
	
}
