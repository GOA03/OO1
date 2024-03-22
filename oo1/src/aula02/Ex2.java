package aula02;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = input.nextLine();
		
		System.out.println("Informe seu genero:");
		String genero = input.nextLine();
		
		System.out.println("Informe seu estado civil:");
		String estadoCivil = input.nextLine();
		
		System.out.println("Informe sua Qtde de filhos:");
		int filhos = input.nextInt();
		
		input.nextLine();
				
		System.out.println("Informe sua escolaridade :");
		String escolariedade = input.nextLine();
		
		System.out.println("Informe sua renda mensal :");
		double renda = input.nextDouble();
		
		System.out.println(nome + " é " + genero + " e é "+ estadoCivil + ", tem " + filhos 
		+ " filhos e sua renda mensal é R$" + String.format("%.2f", renda));
		
	}
}
