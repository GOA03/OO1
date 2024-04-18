package revisao1;

public class Venda {
	
	private Cliente cliente;
	private Funcionario funcionarioResponsavel;
    private Produto[] produtosVendidos;
    private int quantidadeProdutos;
    private double totalVenda;
    
    // Construtor
    public Venda(Cliente cliente, Funcionario funcionarioResponsavel, int quantidadeMaxProdutos) {
        this.cliente = cliente;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.produtosVendidos = new Produto[quantidadeMaxProdutos];
        this.quantidadeProdutos = 0;
        this.totalVenda = 0.0;
    }
    
    public void adicionarProduto(Produto produto) {
        if (quantidadeProdutos < produtosVendidos.length) {
            produtosVendidos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
            totalVenda += produto.getPreco();
        } else {
            System.out.println("Limite de produtos vendidos atingido.");
        }
    }
    
 // Métodos getters para cliente, funcionário responsável e total da venda
    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    // Método para obter a quantidade de produtos vendidos
    public int getQuantidadeProdutosVendidos() {
        return quantidadeProdutos;
    }

    // Método para imprimir os produtos vendidos na venda
    public void imprimirProdutosVendidos() {
        System.out.println("Produtos vendidos:");
        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("- " + produtosVendidos[i].getNome());
        }
    }

    // Método para cancelar a venda, removendo todos os produtos vendidos
    public void cancelarVenda() {
        quantidadeProdutos = 0;
        totalVenda = 0.0;
        System.out.println("Venda cancelada.");
    }
}

/* Para registrar uma venda, o sistema deve permitir que um funcionário associe
   um cliente à compra e selecione os produtos vendidos, registrando-os na venda.
   Além disso, o total da venda deve ser calculado com base nos preços dos 
   produtos selecionados.

	As operações permitidas pelo sistema devem incluir, mas não se limitar a:
	
	Adicionar novos produtos ao estoque;
	Atualizar informações dos produtos, clientes e funcionários;
	Realizar vendas, registrando os produtos vendidos e atualizando o estoque;
	Visualizar relatórios de vendas, estoque e desempenho dos funcionários.

*/