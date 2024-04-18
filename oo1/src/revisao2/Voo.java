package revisao2;

import java.util.Arrays;

public class Voo {

	private int num;
	private String origem;
	private String destino;
	private String data;
	private String hora;
	private boolean[] assentosDisponiveis;
	private int qtdeAssentos;
	private double precoAssento;
	int count;

	public Voo(int num, String origem, String destino, String data, String hora, double precoAssento,
			int quantidadeAssentos) {
		this.num = num;
		this.origem = origem;
		this.destino = destino;
		this.data = data;
		this.hora = hora;
		this.precoAssento = precoAssento;
		this.assentosDisponiveis = new boolean[quantidadeAssentos];
		Arrays.fill(this.assentosDisponiveis, true);
		this.qtdeAssentos = quantidadeAssentos;
		this.count = 1;
	}

	public boolean reservarAssento(int numAssento) {
	    if (numAssento < 1 || numAssento > qtdeAssentos) {
	        System.out.println("O assento " + numAssento + " não existe neste voo.");
	        return false;
	    } else if (this.assentosDisponiveis[numAssento - 1]) {
	        this.assentosDisponiveis[numAssento - 1] = false;
	        System.out.println("Assento " + numAssento + " reservado com sucesso.");
	        return true;
	    } else {
	        System.out.println("O assento " + numAssento + " já está ocupado.");
	        return false;
	    }
	}
	
	public void verificarAssentosDisponiveis() {
	    System.out.println("\nAssentos disponíveis para o voo " + this.num + ":");
	    for (int i = 0; i < assentosDisponiveis.length; i++) {
	        System.out.printf("Ass" + (i + 1) + ":" + (assentosDisponiveis[i] ? "✅ " : "❌ "));
			count += 1;
	        if (count == 6) {
	        	System.out.println();
	        	count = 1;
	        }
	    }
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public boolean[] getAssentosDisponiveis() {
		return assentosDisponiveis;
	}

	public void setAssentosDisponiveis(boolean[] assentosDisponiveis) {
		this.assentosDisponiveis = assentosDisponiveis;
	}

	public int getQtdeAssentos() {
		return qtdeAssentos;
	}

	public void setQtdeAssentos(int qtdeAssentos) {
		this.qtdeAssentos = qtdeAssentos;
	}

	public double getPrecoAssento() {
		return precoAssento;
	}

	public void setPrecoAssento(double precoAssento) {
		this.precoAssento = precoAssento;
	}

	public String toString() {
		return "Voo [num=" + num + ", origem=" + origem + ", destino=" + destino + ", data=" + data + ", hora=" + hora
				+ ", assentosDisponiveis=" + Arrays.toString(assentosDisponiveis) + ", qtdeAssentos=" + qtdeAssentos
				+ ", precoAssento=" + precoAssento + ", count=" + count + "]";
	}
	
	
}
