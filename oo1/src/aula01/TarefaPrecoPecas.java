package aula01;

public class TarefaPrecoPecas {
	
	public static void main(String[] args) {
		String produto1 = "Notebook";
		String produto2 = "SSD";
		
		double precoProduto1 = 3500;
		double precoProduto2 = 250;
		
		System.out.println("Produtos:");
		//System.out.println(produto1 + " por apenas R$" + precoProduto1);
		System.out.printf("%s por apenas R$ %.2f\n", produto1, precoProduto1);
		System.out.println(produto2 + " por apenas R$" + precoProduto2);
	}
}