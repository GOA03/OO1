package lista3;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Doce de leite", 6.99, 2);
		
		produto1.reabastecer(10);
		produto1.exibirInformacoes();
		
		produto1.vender(9);
		produto1.exibirInformacoes();
	}
}
