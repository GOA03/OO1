package aula06;

public class Conta {
	
	int numConta;
	String tirular;
	double saldo;
	static int numContasBanco;
	
	public Conta() {
		numContasBanco ++;
	}
}
