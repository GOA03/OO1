package lista3;

public class Conta {
	
	private int agencia;
	private int conta;
	private double saldo;
	
	public Conta(int agencia, int conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
			System.out.println("R$" + valor + " sacado!");
			this.verificarSaldo();
		} else {
			System.out.println("Saldo insuficiente!\n");
		}
	}
	
	public void depositar(double valor) {
		if (0 < valor) {
			this.saldo += valor;
			System.out.println("R$" + valor + " depositado!");
			this.verificarSaldo();
		} else {
			System.out.println("Não é possivel depoisitar este valor!");
			this.verificarSaldo();
		}
	}
	
	public void verificarSaldo() {
		System.out.println("Saldo atual: R$" + this.saldo + "\n");
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}
	
}
