package orcamento;

public class CalculadoraDeImposto {
	private Imposto imposto;

	public CalculadoraDeImposto(Imposto imposto) {
		super();
		this.imposto = imposto;
	}

	public void realizaCalculo(Orcamento orcamento) {
		imposto.realizaCalculo(orcamento);
	}

	
	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}



}
