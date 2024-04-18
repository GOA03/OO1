package revisao2;

public class VooTeste {

	public static void main(String[] args) {
		
		Voo voo1 = new Voo(1, "Ponta Grossa", "Palmeira", "18/04/2024", "20:00", 50.00, 10);
		
		voo1.reservarAssento(3); voo1.reservarAssento(8); 
		voo1.reservarAssento(2); voo1.reservarAssento(10);
		voo1.reservarAssento(3);
		voo1.reservarAssento(13);
		
		voo1.verificarAssentosDisponiveis();
		
		// Criando passageiro
        Passageiro passageiro1 = new Passageiro("João", "123456789");

        // Realizando reserva
        Reserva reserva1 = new Reserva(passageiro1, voo1, 10);
        reserva1.imprimirReserva();
	}
}
