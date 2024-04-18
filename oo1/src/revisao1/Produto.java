package revisao1;

public class Produto {
	
	private String nome;
	private String marca;
	private double preco;
	private int qtdeEstoque;
	
	public Produto(String nome, String marca, double preco, int qtdeEstoque) {
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
}
