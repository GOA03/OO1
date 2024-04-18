package lista3;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private String modalidade;
	private	int cargaHoraria;
	private String programatico;
	
	public Disciplina(int codigo, String nome, String modalidade, int cargaHoraria, String programatico) {
		this.codigo = codigo;
		this.nome = nome;
		this.modalidade = modalidade;
		this.cargaHoraria = cargaHoraria;
		this.programatico = programatico;
	}
	
	public void gerarRelatorio() {
        System.out.println("Nome: " + nome + " | Código: " + codigo);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Conteúdo programático: " + programatico);
    }
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getProgramatico() {
		return programatico;
	}

	public void setProgramatico(String programatico) {
		this.programatico = programatico;
	}
	
}
