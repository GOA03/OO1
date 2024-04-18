package revisao1;

public class VendaTeste {
	
	public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Smartphone", "Samsung", 1500.0, 10);
        Produto produto2 = new Produto("Notebook", "Dell", 3000.0, 5);

        // Criando cliente
        Cliente cliente1 = new Cliente("João", "Rua A, Cidade B", "123456789");

        // Criando funcionário
        Funcionario funcionario1 = new Funcionario("Maria", "Vendedor", 2000.0);

        // Criando venda
        Venda venda = new Venda(cliente1, funcionario1, 10);

        // Adicionando produtos à venda
        venda.adicionarProduto(produto1);
        venda.adicionarProduto(produto2);

        // Imprimindo detalhes da venda
        System.out.println("Detalhes da venda:");
        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Funcionário responsável: " + venda.getFuncionarioResponsavel().getNome());
        System.out.println("Total da venda: R$" + venda.getTotalVenda());
        System.out.println("Quantidade de produtos vendidos: " + venda.getQuantidadeProdutosVendidos());
        venda.imprimirProdutosVendidos();

        // Cancelando a venda
        venda.cancelarVenda();
    }
}