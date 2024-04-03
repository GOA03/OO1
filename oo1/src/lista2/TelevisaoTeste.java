package lista2;

public class TelevisaoTeste {
	
	public static void main(String[] args) {
		
		Televisao tv1 = new Televisao();
		
		tv1.marca = "XimXim";
		
		tv1.ligar();
		tv1.alterarCanal(1);
		tv1.alterarCanal(-3);
		tv1.alterarCanal(100);
		tv1.alterarVolume(50);
	}
}
