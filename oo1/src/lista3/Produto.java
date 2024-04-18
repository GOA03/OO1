package lista3;

public class Produto {

	private String nome;
	private double preco;
	private int qtdeEstoque;
	private double valorLiquido;
	
	public Produto(String nome, double preco, int qtdeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdeEstoque = qtdeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	
	public double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	
	public void reabastecer(int quantidade) {
		if (quantidade >= 0) {
			this.qtdeEstoque += quantidade;
			System.out.println("O produto " + nome + " foi reabastecido com " + quantidade + " unidade(s)!");
		} else {
			System.out.println("Quantidade inválida!");
		}
	}

	public void vender(int quantidade) {
		if (this.qtdeEstoque >= quantidade) {
			this.qtdeEstoque -= quantidade;
			this.valorLiquido = quantidade * this.preco;
			System.out.println("O produto " + nome + " foi vendido com " + quantidade + " unidade(s)!");
		} else {
			System.out.println("Não há essa quantidade disponivel em estoque do produto " + nome + "!");
			System.out.println("Quantidade Disponivel: " + this.qtdeEstoque);
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("\n  = = = Relatório = = =");
		System.out.println("Nome do Produto: " + nome);
		System.out.println("Preco: R$" + preco);
		System.out.println("Quantidade disponível: " + qtdeEstoque + "uni\n");
	}
	
}
