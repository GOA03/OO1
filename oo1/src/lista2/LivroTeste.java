package lista2;

public class LivroTeste {
	
	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.titulo = "Eu e você";
		
		livro1.emprestar();
		livro1.emprestar();
		livro1.devolver();
		livro1.devolver();
		
		livro1.imprimirDados();
	}
}
