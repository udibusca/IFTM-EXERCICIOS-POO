package lista_15_05_2018.exe3;

public abstract class Moeda {
	
	private Moeda proximo;
	private int valorCapturadoTotal;

	public Moeda getProximo() {
		return proximo;
	}

	public void setProximo(Moeda proximo) {
		this.proximo = proximo;
	}
	
	abstract double troco(Conta conta);
	
	public void valorCapturadoTotal() {
		return valorCapturadoTotal + ((proximo == null) ? 0 : proximo.valorCapturadoTotal());
	}
	
	
}
