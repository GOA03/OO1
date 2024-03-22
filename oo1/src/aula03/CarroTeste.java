package aula03;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		carro1.modelo = "AAA";
		carro1.marca = "AAA";
		carro1.placa = "AAA";
		carro1.cor = "AAA";
		
		carro2.modelo = "BBB";
		carro2.marca = "BBB";
		carro2.placa = "BBB";
		carro2.cor = "BBB";
		
		carro3.modelo = "CCC";
		carro3.marca = "CCC";
		carro3.placa = "CCC";
		carro3.cor = "CCC";

		
		System.out.println(carro1.modelo);
		System.out.println(carro1.marca);
		System.out.println(carro1.placa);
		System.out.println(carro1.cor + "\n");
		
		System.out.println(carro2.modelo);
		System.out.println(carro2.marca);
		System.out.println(carro2.placa);
		System.out.println(carro2.cor + "\n");
		
		System.out.println(carro3.modelo);
		System.out.println(carro3.marca);
		System.out.println(carro3.placa);
		System.out.println(carro3.cor);
	}
}
