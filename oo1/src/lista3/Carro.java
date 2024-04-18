package lista3;

public class Carro {
	
	private String nome;
	private int marcha;
	private int velocidade;
	private static final int VELOCIDADE_MAX = 130;

	public Carro(String nome) {
		this.nome = nome;
		this.marcha = 0;
		this.velocidade = 0;
	}

	public void acelerar(int variacaoVelocidade) {

		if ((velocidade + variacaoVelocidade) <= VELOCIDADE_MAX) {

			velocidade += variacaoVelocidade;
			this.trocarMarcha(variacaoVelocidade);

		} else {

			System.out.println("Não é possível acelerar: " + variacaoVelocidade + "km/h!\n");
			this.exibirInformacoes();
		}
	}
	
	public void frear(int variacaoVelocidade) {
		
		if ((velocidade - variacaoVelocidade) >= 0) {

			velocidade -= variacaoVelocidade;
			this.trocarMarcha(variacaoVelocidade);

		} else {

			System.out.println("Não é possível frear: " + variacaoVelocidade + "km/h!\n");
			this.exibirInformacoes();
		}
	}
	
	private void trocarMarcha(int variacaoVelocidade) {
		
		if (this.velocidade >= 90) {
			marcha = 5;
		} else if (velocidade >= 60) {
			marcha = 4;
		} else if (velocidade >= 40) {
			marcha = 3;
		} else if (velocidade >= 20) {
			marcha = 2;
		} else if (velocidade >= 1) {
			marcha = 1;
		} else {
			marcha = 0;
		}

		this.exibirInformacoes();
	}
	
	public void exibirInformacoes() {
		System.out.println("Carro: " + nome + "\nVelocidade: " + velocidade + "km/h\nMarcha: " + marcha + "\n= = = = = = = = =");
	}
    
    public int getMarcha() {
        return marcha;
    }
    
    public int getVelocidade() {
        return velocidade;
    }

}
