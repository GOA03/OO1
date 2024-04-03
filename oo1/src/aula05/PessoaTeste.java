package aula05;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("João", 25, 68.5);
		Pessoa pessoa2 = new Pessoa("Maria", 32, 55.6);
		Pessoa pessoa3 = new Pessoa("José", 32, 62.4);
		
		System.out.println("= = Pessoa 1 = = =");
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.idade);
		System.out.println(pessoa1.peso + "\n");
		
		
		System.out.println("= = Pessoa 2 = = =");
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.idade);
		System.out.println(pessoa2.peso + "\n");
		
		System.out.println("= = Pessoa 3 = = =");
		System.out.println(pessoa3.nome);
		System.out.println(pessoa3.idade);
		System.out.println(pessoa3.peso);
		
	}
}
