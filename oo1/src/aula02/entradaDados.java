package aula02;

import java.util.Scanner;

public class entradaDados {
	
	public static void main(String[] args) {
		
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String nome = input.nextLine();
		
		System.out.println("Informe sua idade:");
		int idade = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Informe seu estado civil:");
		String estadoCivil = input.nextLine();
		
		System.out.println("Informe seu peso:");
		double peso = input.nextDouble();
		
		System.out.println("estado civil: " + estadoCivil);
		
		
		//System.out.println(nome + " tem " + idade + " anos e " + String.format("%.2f", peso) + "kg");
	}
}
