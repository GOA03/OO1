package teste;

public class Main {
    public static void main(String[] args) {
        // Criando a loja
        Loja minhaLoja = new Loja("123456789", "Minha Loja");

        // Inserindo clientes
        minhaLoja.inserirCliente("12345678900", "João", "senha123");

        // Inserindo produtos
        minhaLoja.inserirProduto("001", "Camiseta", 30.00, 50);
        minhaLoja.inserirProduto("002", "Calça Jeans", 80.00, 20);

        // Verificando produtos cadastrados
        minhaLoja.verificarProdutosCadastrados();

        // Realizando venda
        minhaLoja.realizarVenda("001", 3, "12345678900", "senha123");

        // Atualizando estoque
        minhaLoja.atualizarEstoque("002", 10);

        // Verificando produtos cadastrados após a venda e atualização de estoque
        minhaLoja.verificarProdutosCadastrados();
    }
}
