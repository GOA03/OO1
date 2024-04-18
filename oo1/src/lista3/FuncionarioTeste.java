package lista3;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		// Criando endereços específicos
        Endereco endereco1 = new Endereco("Rua das Flores", 123, "Centro", "Cidade A", "Estado B");
        Endereco endereco2 = new Endereco("Avenida Principal", 456, "Bairro A", "Cidade C", "Estado D");

        // Criando funcionários com endereços específicos
        Funcionario funcionario1 = new Funcionario(1, "João da Silva", "01/01/01", "M", "Departamento X", 123456789, endereco1);
        Funcionario funcionario2 = new Funcionario(2, "Maria Souza", "10/10/10", "F", "Departamento Y", 987654321, endereco2);

        // Emitindo relatório dos funcionários
        System.out.println("Relatório do Funcionário 1:");
        funcionario1.gerarRelatorio();
        System.out.println("\nRelatório do Funcionário 2:");
        funcionario2.gerarRelatorio();
	}
}
