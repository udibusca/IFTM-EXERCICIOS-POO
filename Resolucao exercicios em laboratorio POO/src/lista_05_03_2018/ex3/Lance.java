package lista_05_03_2018.ex3;

public class Lance {

	private String nomeArrematante;
	private double valor;

	public Lance(String nomeArrematante, double valor) {
		super();
		this.nomeArrematante = nomeArrematante;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNomeArrematante() {
		return nomeArrematante;
	}

	public void setNomeArrematante(String nomeArrematante) {
		this.nomeArrematante = nomeArrematante;
	}
	
	
	
}
