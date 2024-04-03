package lista2;

public class Televisao {
	
	String marca;
	int resolucao;
	double polegadas;
	int canalAtual = 1;
	int volumeAtual = 50;
	boolean ligado = false;
	
	public void ligar(){
		if (ligado) {
			System.out.println("A TV: " + marca + " já está ligada!");
		} else {
			ligado = true;
			System.out.println("A TV: " + marca + " foi ligada!");
		}
	}
	
	public void desligar() {
		if (!ligado) {
			System.out.println("A TV: " + marca + " já está desligada!");
		} else {
			ligado = false;
			System.out.println("A TV: " + marca + " foi desligada!");
		}
	}
	
	public void alterarCanal(double canal) {
		if(ligado = true && (canalAtual + canal) >= 1) {
			canalAtual = (int) (canalAtual + canal);
			System.out.println("A TV: " + marca + " está no canal: " + canalAtual + "!");
		} else if ((canalAtual + canal) <= 0){
			System.out.println("O canal: " + String.format("%.0f", (canalAtual + canal)) + " não existe!");
		} else {
			System.out.println("A TV: " + marca + " está desligada!");
		}
	}
	
	public void alterarVolume(double volume) {
		if(ligado = true && (volumeAtual + volume) >= 0 && (volumeAtual + volume) <= 100) {
			volumeAtual = (int) (volumeAtual + volume);
			System.out.println("A TV: " + marca + " está no volume: " + volumeAtual + "!");
		} else if ((volumeAtual + volume) <= 0 || (volumeAtual + volume) >= 100){
			System.out.println("O volume: " + String.format("%.0f", (volumeAtual + volume)) + " não existe!");
		} else {
			System.out.println("A TV: " + marca + " está desligada!");
		}
	}
}
