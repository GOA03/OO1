package teste;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String cnpj;
    private String nome;
    private List<Cliente> clientes;
    private List<Produto> produtos;

    public Loja(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.produtos = new ArrayList<>();
    }

    public void inserirCliente(String cpf, String nome, String senha) {
        Cliente novoCliente = new Cliente(cpf, nome, senha);
        clientes.add(novoCliente);
        System.out.println("Novo cliente cadastrado com sucesso.");
    }

    public void inserirProduto(String codigo, String nome, double valorUnitario, int quantidadeEstoque) {
        Produto novoProduto = new Produto(codigo, nome, valorUnitario, quantidadeEstoque);
        produtos.add(novoProduto);
        System.out.println("Novo produto cadastrado com sucesso.");
    }

    public void verificarProdutosCadastrados() {
        System.out.println("Produtos cadastrados na loja:");
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo() + ", Nome: " + produto.getNome() +
                    ", Valor unitário: " + produto.getValorUnitario() + ", Quantidade em estoque: " +
                    produto.getQuantidadeEstoque());
        }
    }

    public void realizarVenda(String codigoProduto, int quantidade, String cpf, String senha) {
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf) && c.getSenha().equals(senha)) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("CPF ou senha incorretos. Login falhou.");
            return;
        }

        Produto produto = null;
        for (Produto p : produtos) {
            if (p.getCodigo().equals(codigoProduto)) {
                produto = p;
                break;
            }
        }

        if (produto == null) {
            System.out.println("Produto não encontrado na loja.");
            return;
        }

        if (produto.getQuantidadeEstoque() < quantidade) {
            System.out.println("Não há estoque suficiente para atender a demanda.");
            return;
        }

        double valorTotal = quantidade * produto.getValorUnitario();
        System.out.println("Venda realizada com sucesso:");
        System.out.println("Código do produto: " + produto.getCodigo());
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Valor unitário: " + produto.getValorUnitario());
        System.out.println("Valor total da venda: " + valorTotal);

        produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
    }

    public void atualizarEstoque(String codigoProduto, int quantidadeAdquirida) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigoProduto)) {
                produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() + quantidadeAdquirida);
                System.out.println("Estoque atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado na loja.");
    }
}
