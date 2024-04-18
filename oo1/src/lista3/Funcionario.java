package lista3;

public class Funcionario {

	private int numRegistro;
	private String nome;
	private String dataNascimento;
	private String sexo;
	private String setor;
	private int telefone;
	private Endereco endereco;

	public Funcionario(int numRegistro, String nome, String data, String sexo, String setor, int telefone, Endereco endereco) {

		this.numRegistro = numRegistro;
		this.nome = nome;
		this.dataNascimento = data;
		this.sexo = sexo;
		this.setor = setor;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	// Método para emitir um relatório com os dados do funcionário
    public void gerarRelatorio() {
        System.out.println("Número de Registro: " + numRegistro);
        System.out.println("Nome Completo: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Setor: " + setor);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco.toString());
    }

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
