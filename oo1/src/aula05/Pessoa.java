package aula05;

public class Pessoa {
	
	String nome;
	int idade;
	double peso;
	
	public void andar() {
		System.out.println(nome + " está andando!");
	}
	
	public void correr() {
		System.out.println(nome + " está correndo!");
	}
	
	public void falar() {
		System.out.println(nome + " está falando!");
	}
	
	public void imprimirDados() {
		System.out.println("\n= - = DADOS = - =");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + "anos");
		System.out.println("Peso: " + peso + "kg\n");
	}
	
	public String toString() {
		return "Nome: " + nome + 
		" " + "\nIdade: " + idade +
		" " + "\nPeso: " + peso +
		"\n";
	}
}
