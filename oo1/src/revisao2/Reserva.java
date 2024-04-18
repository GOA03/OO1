package revisao2;
public class Reserva {
	
    private Passageiro passageiro;
    private Voo voo;
    private int numeroAssento;

    // Construtor
    public Reserva(Passageiro passageiro, Voo voo, int numeroAssento) {
        this.passageiro = passageiro;
        this.voo = voo;
        this.numeroAssento = numeroAssento;
        voo.reservarAssento(numeroAssento);
    }
    
    public void imprimirReserva() {
    	System.out.println("\n= = = = = = = = = =");
    	System.out.println("Passageiro: " + this.passageiro.getNome());
    	System.out.println("Voo: " + this.voo.getNum());
    	System.out.println("Assento: " + this.numeroAssento);
    }

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}

	public int getNumeroAssento() {
		return numeroAssento;
	}

	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
    
    
}