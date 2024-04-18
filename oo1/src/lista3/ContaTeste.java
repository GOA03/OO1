package lista3;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(111, 2222, 2900);
		
		conta1.sacar(100);
		conta1.depositar(200);
		conta1.sacar(3000);
		conta1.verificarSaldo();
	}
}
