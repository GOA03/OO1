package lista2;

public class Livro {
	
	String titulo;
	String autor;
	String editora;
	int numeroDePagina;
	int anoDePublicacao;
	boolean situacao = true; //true == disponível
	
	public void emprestar() {
		if(situacao) {
			situacao = false;
			System.out.println("O livro: " + titulo + " foi emprestado!");
		} else {
			System.out.println("O livro: " + titulo + " não está disponível!");
		}
	}
	
	public void devolver() {
		if(!situacao) {
			situacao = true;
			System.out.println("O livro: " + titulo + " foi devolvido!");
		} else {
			System.out.println("O livro: " + titulo + " não está emprestado!");
		}
	}

	public void imprimirDados() {
		System.out.println("\nLivro [titulo= " + titulo + ", autor=" + autor + ", editora=" + editora + ", numeroDePagina="
				+ numeroDePagina + ", anoDePublicacao=" + anoDePublicacao + ", situacao=" + situacao + "]");
	}
}