package aula06;

public class Conta {
	
	int numConta;
	String titular;
	double saldo;
	static int numContasBanco;
	
	public Conta() {
		numContasBanco ++;
		numConta = numContasBanco;
	}
}
