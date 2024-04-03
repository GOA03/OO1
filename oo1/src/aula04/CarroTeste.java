package aula04;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		Carro carro2 = new Carro();
		
	
		//atribuir valores para os atributos ds objetos
		carro1.modelo = "fusca";
		carro1.marca = "volkswagen";
		carro1.ano = 1970;
		carro1.placa = "ABC-1234";
		carro1.cor = "Amarelo";
		
		carro2.modelo = "Civic";
		carro2.marca = "Honda";
		carro2.ano = 2015;
		carro2.placa = "MNO-9876";
		carro2.cor = "Azul";
		
		carro1.frear();
		carro1.frear();
		carro1.ligar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.desligar();
		carro1.frear();
		carro1.frear();
		carro1.frear();
		carro1.desligar();

		/*System.out.println("= = = =  Carro 1 = = = =");
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Marca: " + carro1.marca);
		*/
	}
}