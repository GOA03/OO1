package revisao2;

public class Passageiro {
	
    private String nome;
    private String numeroDocumento;

    public Passageiro(String nome, String numeroDocumento) {
        this.nome = nome;
        this.numeroDocumento = numeroDocumento;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
    
}